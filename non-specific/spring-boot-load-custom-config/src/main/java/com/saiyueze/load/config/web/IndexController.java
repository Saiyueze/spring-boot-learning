package com.saiyueze.load.config.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saiyueze.load.config.config.ApplicationConfig;
import com.saiyueze.load.config.config.DataSourceConfig;

@RestController
public class IndexController {

	@Autowired
	DataSourceConfig dSourceConfig;
	
	@Autowired
	ApplicationConfig applicationConfig;
	
	@RequestMapping(value = "data/source/config")
	public  String getDataSourceConfig() {
		
		return dSourceConfig.toString();
	}
	
	
	@RequestMapping(value =  "application/config")
	public String getApplicationConfig() {
		return applicationConfig.toString();
	}
}
