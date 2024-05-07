package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class BootProj07BulkDataInjectionUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication
				.run(BootProj07BulkDataInjectionUsingConfigurationPropertiesApplication.class, args);

		Company company = ctx.getBean("company", Company.class);
		System.out.println(company);

	}

}
