package com.eksad.latihanspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//controller sebagai router
@Controller
public class HelloController {
	
//	@RequestMapping("/hello")
//	@ResponseBody
//	public String sayHello() {
//		return "Hello World";
//	}
	
// -------------------------------------------------
	
	// http://localhost:8080/myName?myName=Afra
	// jadi kalo pake @RequestParam itu kita harus ngetik nama yang pengen ditampilin
	// abis nyebutin manggil method yang mana, ditambah ?(nama method)=nama yang diinginkan
	// jadinya /myName?myName=Afra
//	@RequestMapping("/myName")
//	@ResponseBody
//	public String myName(@RequestParam String myName) {
//		return "Hello " + myName;
//	}
	
// -----------------------------------------------------------------------------------------------------------------
	
	// http://localhost:8080/namaSaya/Afra
//	@RequestMapping("/namaSaya/{myName}")
//	@ResponseBody
//	public String namaSaya(@PathVariable String myName) {
//		return "Hello " + myName;
//	}
	
// -----------------------------------------------------------------------------------------------------------------
	
	// http://localhost:8080/toGoogle
//	@RequestMapping("/toGoogle")
//	@ResponseBody
//	public String toGoogle() {
//		return "<a href = 'https://www.google.com'> Klik disini menuju Google </a>";
//	}
	
// -----------------------------------------------------------------------------------------------------------------
	
	// http://localhost:8080/toPilihAja
	// target='_blank' artinya nanti bakal kebuka di new tab
	@RequestMapping("/toPilihAja")
	@ResponseBody
	public String toPilihAja() {
		return "<a href = 'https://www.youtube.com' target = '_blank'> Klik disini menuju Youtube </a> "
				+ "</br> <a href = 'https://www.google.com' target ='_blank'> Klik disini menuju Google </a>";
	}

}
