package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.LanguageService;

@Controller
public class ShowLanguageController {
	@Autowired
private LanguageService service;
	
	  @RequestMapping("/home.htm")
	  
	  public String getHome(Map<String,Object> map) {
	  
	  return "home"; }
	 
	
	
	@RequestMapping("/language.htm")
	public String getLanguage(Map<String,Object> map) {
		List<String> langList;
		//user service
		langList=service.languageService();
		System.out.println(langList);
		//add model attribute
		map.put("speakingLanguage", langList);
		return "language";
	}
}
