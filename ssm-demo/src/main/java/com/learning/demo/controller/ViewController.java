package com.learning.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.demo.controller.base.BaseController;
import com.learning.demo.service.erp.IErpCompaniesService;

@Controller
@RequestMapping("")
public class ViewController extends BaseController {

	@Autowired
	private IErpCompaniesService iErpCompaniesService;

	@RequestMapping("/view/company")
	public String createCompany() {
		System.out.println("catch the url..........");
		return "company/company";
	}

	@RequestMapping("")
	public String index() {
		return "index";
	}
}
