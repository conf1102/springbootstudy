package com.alvin.springbootstudy;

import com.alvin.springbootstudy.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class SpringbootstudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootstudyApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
		ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet(),"/s2");
		bean.setLoadOnStartup(1);
		return bean;
	}


}
