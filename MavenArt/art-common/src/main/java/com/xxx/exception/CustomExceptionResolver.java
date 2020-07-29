package com.xxx.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException( HttpServletRequest request, HttpServletResponse response, Object obj,
                                          Exception e) {
//		if(e instanceof CustomException) {
//			
//		}
		ModelAndView mav = new ModelAndView ();
		mav.addObject("msg", e.getMessage());
		e.printStackTrace();
		mav.setViewName("error");
		return mav;
	}

}
