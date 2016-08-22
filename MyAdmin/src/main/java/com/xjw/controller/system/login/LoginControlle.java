package com.xjw.controller.system.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.node.ObjectNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xjw.controller.base.BaseController;
import com.xjw.util.PageData;

@Controller
public class LoginControlle extends BaseController{

	@RequestMapping(value="/login_toLogin")
	public ModelAndView toLogin()throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		pd.put("SYSNAME", "MyAdmin"); //读取系统名称
		mv.setViewName("system/admin/login");
		mv.addObject("pd",pd);
		mv.addObject("basePath", this.getRequest().getContextPath());
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/checkUser")
	public String checkUser(HttpServletRequest request,
            HttpServletResponse response){
		
		ObjectMapper mapper = new ObjectMapper();
        ArrayNode jsonArray = mapper.createArrayNode();
        ObjectNode json = mapper.createObjectNode();
        
        
        json.put("key", "{FBI:[{name:'rose',age:'25'},{name:'jack',age:'23'}],NBA:[{name:'tom',sex:'man'},{name:'jack',sex:'women'}]}");
        jsonArray.add(json);
        
        System.out.println(jsonArray.toString());
		return jsonArray.toString();
	}
}
