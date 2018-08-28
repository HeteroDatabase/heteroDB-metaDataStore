package com.heteroDB.metaDataStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MetaDataStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetaDataStoreApplication.class, args);
	}
}
