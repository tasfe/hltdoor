import com.alibaba.fastjson.JSONObject;
import com.hltdoor.rpc.device.XmppService;
import com.hltdoor.wechat.HttpRequestUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by linwei on 2016/11/15.
 *
 */


public class TestBase {


    @Test
    public void test()
    {
        JSONObject res = new HttpRequestUtil().httpGet("http://www.hltdoor.com");
        System.out.println(res.toJSONString());
    }
}
