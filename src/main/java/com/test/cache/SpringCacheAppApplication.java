package com.test.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringCacheAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCacheAppApplication.class, args);
	}

}
