/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */

package com.jci.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;


/**
 * The Class Application.
 */
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
public class Application {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
	
	/**
	 * Feign logger level.
	 *
	 * @return the feign. logger. level
	 */
	@Bean
	public feign.Logger.Level feignLoggerLevel() {
	    return feign.Logger.Level.FULL;
	}
}
