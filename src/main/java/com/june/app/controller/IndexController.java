package com.june.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.june.app.service.JobService;

@Controller
@RequestMapping(value = "/Tiles")
public class IndexController {

	private final Log log = LogFactory.getLog(this.getClass());

	@Autowired
	private JobService jobService;
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("redirect:/main");
	}
	
	
	@RequestMapping(value = "/main")
	public ModelAndView main() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",  "test");
		return new ModelAndView("main", model);
	}
	
	@RequestMapping(value = "/blog")
	public ModelAndView blog() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",  "test");
		return new ModelAndView("blog", model);
	}
	/*@RequestMapping(value = "/index")
	@ResponseBody
	public Map<String,? extends Object> requestIndex(@RequestParam String param, int page){
		System.out.println("===== param ======"+param);
		System.out.println("===== page  ======"+page);
		log.debug("controller is called");
		List<JobInfo> contacts = jobService.getSampleInfo();
		
		return ExtJSReturn.mapOK(contacts, page, 24); 
	}
	
	@RequestMapping(value = "/create")
	@ResponseBody
	public Map<String,? extends Object> create(@RequestBody JobInfo data){
		
		log.debug("controller is called");
		List<JobInfo> contacts = jobService.getSampleInfo();
		
		return ExtJSReturn.mapOK(contacts); 
	}*/
	
}