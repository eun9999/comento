package com.eun.settingweb_boot.dao;
import java.util.HashMap;
 
//import com.eun.settingweb_boot.dto.StatisticDto;
 
public interface StatisticMapper {
    public HashMap<String, Object> selectYearLogin(String year);
    public HashMap<String, Object> selectMonthLogin(String month);
    public HashMap<String, Object> selectDayLogin(String month);
    public HashMap<String, Object> selectDeptMonthLogin(String dept, String month);
    
}