package priv.cjb.demo.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import priv.cjb.demo.bean.base.Response;
import priv.cjb.demo.bean.domain.erp.ErpCompanies;
import priv.cjb.demo.controller.base.BaseController;
import priv.cjb.demo.redis.RedisServiceImpl;
import priv.cjb.demo.service.erp.IErpCompaniesService;
import priv.cjb.demo.utils.SerializeUtil;

@RestController
@RequestMapping("/sys")
public class DemoController extends BaseController {

	@Autowired
	private IErpCompaniesService iErpCompaniesService;
	@Autowired
	private RedisServiceImpl redisService;
	
	private Logger logger = Logger.getLogger(DemoController.class);

	@RequestMapping(value = "/get/{id}")
	public ErpCompanies get(@PathVariable Integer id) {
		ErpCompanies erpCompanies = iErpCompaniesService.getByPrimaryId(id);
		System.out.println(erpCompanies.toString() + "...");
		logger.info(erpCompanies.toString() + "...");
		
		return erpCompanies;
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
		Integer id = erpCompanies.getCompanyId();
		if (flag != 1) {
			response.failure("新增错误");
			return response;
		}
		response.success(id, "新增成功");
		return response;
	}
	
	@RequestMapping(value = "/getRedisAllData")
	public List<Object> getRedisAllData() {
		Long dbSize = redisService.dbSize();
		List<Object> listRet = new ArrayList<>();
		if (dbSize > 0) {
			List<String> list = null;
			try {
				list = redisService.getAll();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			for(String content : list) {
				listRet.add(SerializeUtil.serialize(content));
			}
		}
		return listRet;
	}
}
