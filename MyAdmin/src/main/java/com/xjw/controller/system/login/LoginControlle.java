package com.xjw.controller.system.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xjw.util.Const;
import com.xjw.util.PageData;
import com.xjw.util.Tools;
import com.xjw.controller.base.BaseController;

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
		return mv;
	}
}
