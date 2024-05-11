package cn.simplemicroservice.stockclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"cn.simplemicroservice.stockclient"})
@EnableEurekaClient
@EnableFeignClients("cn.simplemicroservice.stockclient")
public class StockClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockClientApplication.class, args);
    }

}
