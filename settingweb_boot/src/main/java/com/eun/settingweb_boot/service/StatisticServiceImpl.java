package com.eun.settingweb_boot.service;
 
 
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.eun.settingweb_boot.dao.StatisticMapper;
 
@Service
public class StatisticServiceImpl implements StatisticService {
    
    
    @Autowired
    private StatisticMapper uMapper;
    
    @Override
    public HashMap<String, Object> yearloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal = new HashMap<String,Object>();
        
        try {
            retVal = uMapper.selectYearLogin(year);
            retVal.put("year", year);
            retVal.put("is_success", true);
            
        }catch(Exception e) {
            retVal.put("totCnt", -999);
            retVal.put("year", year);
            retVal.put("is_success", false);
        }
        
        return retVal;
    }
    
    @Override
    public HashMap<String, Object> monthloginNum (String month) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal2 = new HashMap<String,Object>();
        
        try {
            retVal2 = uMapper.selectMonthLogin(month);
            retVal2.put("month", month);
            retVal2.put("is_success", true);
            
        }catch(Exception e) {
            retVal2.put("totCnt", -999);
            retVal2.put("month", month);
            retVal2.put("is_success", false);
        }
        
        return retVal2;
    }
    
    
	@Override
    public HashMap<String, Object> dayloginNum (String day) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal3 = new HashMap<String,Object>();
        
        try {
            retVal3 = uMapper.selectDayLogin(day);
            retVal3.put("day", day);
            retVal3.put("is_success", true);
            
        }catch(Exception e) {
            retVal3.put("totCnt", -999);
            retVal3.put("day", day);
            retVal3.put("is_success", false);
        }
        
        return retVal3;
    }
	
	
	@Override
	public HashMap<String, Object> dayAVGloginNum (String year) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal4 = new HashMap<String,Object>();
        
        try {
            retVal4 = uMapper.selectAVGLogin(year);
            retVal4.put("year", year);
            retVal4.put("is_success", true);
            
        }catch(Exception e) {
            retVal4.put("AVG", -999);
            retVal4.put("year", year);
            retVal4.put("is_success", false);
        }
        
        return retVal4;
    }
	
	@Override
    public HashMap<String, Object> deptmonthloginNum (String dept, String month) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal5 = new HashMap<String,Object>();
        
        try {
            retVal5 = uMapper.selectDeptMonthLogin(dept, month);
            retVal5.put("dept", dept);
            retVal5.put("month", month);
            retVal5.put("is_success", true);
            
        }catch(Exception e) {
            retVal5.put("totCnt", -999);
            retVal5.put("month", month);
            retVal5.put("is_success", false);
        }
        
        return retVal5;
    }
}