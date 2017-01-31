package com.hltdoor.rpc.impl.xmpp;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.iot.model.v20160530.PubRequest;
import com.aliyuncs.iot.model.v20160530.PubResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.aliyuncs.utils.Base64Helper;
import com.hltdoor.model.HDevice;
import com.hltdoor.model.HDeviceCommand;
import com.hltdoor.model.HUsers;
import com.hltdoor.rpc.device.XmppService;
import com.hltdoor.service.AuthService;
import com.hltdoor.service.DeviceService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by linwei on 2016/11/15.
 * xmpp service
 */
public class XmppServiceImpl implements XmppService {
    private final Logger logger = LogManager.getLogger(XmppServiceImpl.class);
    @Resource
    private AuthService authService;
    @Resource
    private DeviceService deviceService;


    public String sendCommand(String openId, String command) {
        HUsers user = authService.getUserByOpenId(openId);
        if (user == null)
            return null;

        command = command.replaceAll("[^\u4e00-\u9fa5]","");
        HDevice hDevice = deviceService.getDeviceById(user.getDeviceId());
        HDeviceCommand command1 = deviceService.getDeviceCommandByDeviceIdAndString(user.getDeviceId(), command);

        String to = deviceService.getDeviceById(user.getDeviceId()).getName() + "@hltdoor.com";
        String timsamp = String.valueOf((new Date()).getTime());
        if (command1 == null)
        {
            return "没有找到该指令:"+command;
        }

        String accessKey = "ke0jv5RREMduGSwW";
        String accessSecret = "P1zkS5HAiku5PVZQNT4rBFi1sNbAjx";

        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou",accessKey, accessSecret);
        DefaultAcsClient client = new DefaultAcsClient(profile);//初始化SDK客户端

        String data = Base64Helper.encode(command1.getCommand().getBytes());

        PubRequest pubRequest = new PubRequest();
        pubRequest.setProductKey(1000086763L);
        pubRequest.setMessageContent(data);
        pubRequest.setTopicFullName("/1000086763/"+hDevice.getName());
        pubRequest.setQos(1);

        try {
            PubResponse pubResponse = client.getAcsResponse(pubRequest);
            System.out.println(pubResponse.getRequestId());//当次请求的ID
            System.out.println(pubResponse.getSuccess());//请求是否成功.
            System.out.println(pubResponse.getErrorMessage());//出错时的错误信息
            if (pubResponse.getSuccess())
            {
                logger.info("success:/1000086763/"+ hDevice.getName());
                return "操作成功:" + command;
            }
            return "未知错误";
        } catch (ClientException e) {
            e.printStackTrace();
            return "未知错误";
        }



    }
}
