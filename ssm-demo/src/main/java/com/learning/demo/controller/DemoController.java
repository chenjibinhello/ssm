package com.learning.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.learning.demo.bean.base.Response;
import com.learning.demo.bean.domain.erp.ErpCompanies;
import com.learning.demo.controller.base.BaseController;
import com.learning.demo.service.erp.IErpCompaniesService;

@RestController
@RequestMapping("/sys")
public class DemoController extends BaseController {

	@Autowired
	private IErpCompaniesService iErpCompaniesService;

	@RequestMapping(value = "get/{id}")
	public ErpCompanies get(@PathVariable Integer id) {
		System.out.println(id);
		return iErpCompaniesService.getByPrimaryId(id);
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/company", method = RequestMethod.POST)
	public Response createCompany(ErpCompanies erpCompanies, ModelAndView modelAndView) {
		Response response = new Response();
		if (erpCompanies == null) {
			response.failure("入参错误");
			return response;
		}
		Integer flag = iErpCompaniesService.insert(erpCompanies);
		Integer id = erpCompanies.getId();
		if (flag != 1) {
			response.failure("新增错误");
			return response;
		}
		response.success(id, "新增成功");
		return response;
	}
}
