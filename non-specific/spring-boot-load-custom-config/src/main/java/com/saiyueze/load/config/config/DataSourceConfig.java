package com.saiyueze.load.config.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "saiyueze.data")
@PropertySource(value = "classpath:jdbc.properties")
public class DataSourceConfig {

	@Value("${saiyueze.data.jdbc.driverClassName}")
	private String driverClassName;
	
	@Value("${saiyueze.data.jdbc.url}")
	private String url;
	
	@Value("${saiyueze.data.jdbc.username}")
	private String userName;
	
	@Value("${saiyueze.data.jdbc.password}")
	private String password;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DataSourceConfig [driverClassName=" + driverClassName + ", url=" + url + ", userName=" + userName
				+ ", password=" + password + "]";
	}
}
