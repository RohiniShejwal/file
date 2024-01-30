package com.BikkadIT.UIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {

//	@GetMapping("/addition/{a}")
//	public ModelAndView getadd(@PathVariable int a) {
//		
//		int addition = a+a;
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("ADD", addition);
//		mav.setViewName("add");
//		return mav;
//	}
	
	@GetMapping("/addition/{a}/and/{b}/and/{c}")
	public ModelAndView add(@PathVariable int a, @PathVariable int b,@PathVariable int c) {
		
		int addition = a+b+c;
		ModelAndView mav = new ModelAndView();
		mav.addObject("ADD", addition);
		mav.setViewName("addition");
		return mav;
	}

}
