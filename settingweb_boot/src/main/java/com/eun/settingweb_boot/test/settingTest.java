package com.eun.settingweb_boot.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
import com.eun.settingweb_boot.dao.StatisticMapper;
import com.eun.settingweb_boot.service.StatisticService;
 
 
 
@Controller
@RequestMapping("/login")
public class settingTest {
    
    @Autowired
    private StatisticService service;
    
    
    @ResponseBody
	@RequestMapping("/sqlyearStatistic/{year}")
	public Map<String, Object> sqltest(@PathVariable String year) throws Exception{ 
        
        return service.yearloginNum(year);
    }
    
    @ResponseBody
    @RequestMapping("/sqlmonthStatistic/{month}")
	public Map<String, Object> sqltest2(@PathVariable String month) throws Exception{ 
        return service.monthloginNum(month);
    }
    
    @ResponseBody
    @RequestMapping("/sqldayStatistic/{day}")
	public Map<String, Object> sqltest3(@PathVariable String day) throws Exception{ 
        return service.dayloginNum(day);
    }
    
    @ResponseBody
    @RequestMapping("/sqldayAVGStatistic/{year}")
	public Map<String, Object> sqltest4(@PathVariable String year) throws Exception{ 
        return service.dayAVGloginNum(year);
    }
    
    @ResponseBody
    @RequestMapping("/sqldeptmonthStatistic/{dept}/{month}")
	public Map<String, Object> sqltest5(@PathVariable String dept, @PathVariable String month) throws Exception{ 
        return service.deptmonthloginNum(dept, month);
    }
    
    
    @RequestMapping("/test")
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
}