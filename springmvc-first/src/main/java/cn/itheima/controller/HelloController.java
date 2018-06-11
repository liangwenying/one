package cn.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello.do")
	public ModelAndView hello(){
//		创建ModelAndView对象
		ModelAndView mav = new ModelAndView();
			
//		设置响应模型数据
		/**
		 * addObject
		 * 设置模型数据 
		 * 	参数 
		 *     attributeName 模型名
		 *     attributeValue 模型数据
		 */
		mav.addObject("hello","hello Java");
		
//		设置响应的页面
		/**
		 * setViewName 设置响应的试图
		 * 	参数
		 * 		viewName 试图名称(跳转到的页面地址)
		 */
		mav.setViewName("hello");
		
		
		return mav;
	}
}
