package com.yzh.boot_dubbo_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.yzh.boot_dubbo_provider"})
public class BootDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootDubboProviderApplication.class, args);
		try {  
            System.in.read();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 
	}
}
