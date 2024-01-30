package com.BikkadIT.UIToController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class TeacherController {

	@GetMapping("/teacher/{address}")
	public String getinfo(@PathVariable String address, Model model) {
		
		
		String msg = "I am from "+address+" ";
		model.addAttribute("TRT", msg);
	    return "teacher1";
		
	}
	
	
//	@GetMapping("/teacher/{name}/and/{city}")
//	public String get(@PathVariable String name,@PathVariable String city,Model model) {
//		
//		String msg = "My name is "+name+ " I am from " +city+ " ";
//		model.addAttribute("TR", msg);
//		return "teacher";		
//	}
}
