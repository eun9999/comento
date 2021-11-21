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
        HashMap<String, Object> retVal2 = new HashMap<String,Object>();
        
        try {
            retVal2 = uMapper.selectDayLogin(day);
            retVal2.put("day", day);
            retVal2.put("is_success", true);
            
        }catch(Exception e) {
            retVal2.put("totCnt", -999);
            retVal2.put("day", day);
            retVal2.put("is_success", false);
        }
        
        return retVal2;
    }
    
	@Override
    public HashMap<String, Object> deptmonthloginNum (String dept, String month) {
        // TODO Auto-generated method stub
        HashMap<String, Object> retVal2 = new HashMap<String,Object>();
        
        try {
            retVal2 = uMapper.selectDeptMonthLogin(dept, month);
            retVal2.put("dept", dept);
            retVal2.put("month", month);
            retVal2.put("is_success", true);
            
        }catch(Exception e) {
            retVal2.put("totCnt", -999);
            retVal2.put("month", month);
            retVal2.put("is_success", false);
        }
        
        return retVal2;
    }
}