package com.xxx.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj,
			Exception e) {
//		if(e instanceof CustomException) {
//			
//		}
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", e.getMessage());
		mav.setViewName("error");
		return mav;
	}

}
