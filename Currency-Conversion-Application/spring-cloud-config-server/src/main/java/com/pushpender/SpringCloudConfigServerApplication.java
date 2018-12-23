package com.pushpender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/* To make encypt/decrpt req
 * curl localhost:8888/encrypt -d <DataToEncrypt>
 * curl localhost:8888/decrypt -d <DataToDecrypt> */

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
	}
}
