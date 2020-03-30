package com.saiyueze.load.config.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 说明：因为配置文件写在application.properties文件中，会被默认加载，因此此处只用引用
 * 
 * @author Saiyueze
 *
 */
@Component
public class ApplicationConfig {

	@Value("${server.port}")
	private String serverPort;
	
	@Value("${spring.application.name}")
	private String applicationname;
	
	@Value("${saiyueze.test.name}")
	private String testName;
	
	@Value("${saiyueze.test.gender}")
	private String testGender;

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getApplicationname() {
		return applicationname;
	}

	public void setApplicationname(String applicationname) {
		this.applicationname = applicationname;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getTestGender() {
		return testGender;
	}

	public void setTestGender(String testGender) {
		this.testGender = testGender;
	}

	@Override
	public String toString() {
		return "ApplicationConfig [serverPort=" + serverPort + ", applicationname=" + applicationname + ", testName="
				+ testName + ", testGender=" + testGender + "]";
	}
	
}
