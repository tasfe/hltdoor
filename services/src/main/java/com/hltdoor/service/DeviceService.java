package com.hltdoor.service;

import com.hltdoor.mapper.HDeviceCommandMapper;
import com.hltdoor.mapper.HDeviceMapper;
import com.hltdoor.model.HDevice;
import com.hltdoor.model.HDeviceCommand;
import com.hltdoor.model.HDeviceCommandExample;
import com.hltdoor.model.HDeviceExample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by linwei on 2016/11/15.
 * device service
 */
@Service
@Transactional
public class DeviceService {
    private final Logger logger = LogManager.getLogger(DeviceService.class);
    @Resource
    private HDeviceMapper hDeviceMapper;
    @Resource
    private HDeviceCommandMapper hDeviceCommandMapper;

    public HDevice getDeviceById(Integer id)
    {
        HDeviceExample hDeviceExample = new HDeviceExample();
        HDeviceExample.Criteria criteria = hDeviceExample.createCriteria();
        criteria.andIdEqualTo(id);
        try{
            return hDeviceMapper.selectByExample(hDeviceExample).get(0);
        }catch (Exception e){
            logger.error(e.getMessage());
            return  null;
        }
    }

    public HDeviceCommand getDeviceCommandByDeviceIdAndString(Integer deviceId,String command)
    {
        HDeviceCommandExample hDeviceCommandExample = new HDeviceCommandExample();
        HDeviceCommandExample.Criteria criteria = hDeviceCommandExample.createCriteria();
        criteria.andCommandTextLike(command);
        criteria.andDeviceIdEqualTo(deviceId);
        try{
            return hDeviceCommandMapper.selectByExample(hDeviceCommandExample).get(0);
        }catch (Exception e){
            logger.error(e.getMessage());
            return null;
        }

    }
}
