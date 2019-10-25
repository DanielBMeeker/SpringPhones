package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Phone;


@Configuration
public class BeanConfiguration {
	@Bean
	public Phone phone() {
		Phone bean = new Phone();
		bean.setNumber("319-560-1234");
		bean.setBrand("Apple");
		bean.setModel("iPhone XR");
		bean.setCapacityGB(128);

		return bean;
	}
}
