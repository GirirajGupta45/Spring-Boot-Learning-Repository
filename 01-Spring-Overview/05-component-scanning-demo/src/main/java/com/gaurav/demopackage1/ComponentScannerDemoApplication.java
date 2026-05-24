package com.gaurav.demopackage1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {"com.gaurav.demopackage1","com.gaurav.demopackage3"}
)
public class ComponentScannerDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComponentScannerDemoApplication.class,args);
    }
}
