package inid.hui.booking.consumer.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ucs_liwenhui
 * @description 启动类
 * @date 2019/5/13 9:45
 **/

@ComponentScan({"inid.hui.booking.consumer.user","inid.hui.booking.api.user"})
@EnableFeignClients(basePackages = "inid.hui.booking.api.user")
@FeignClient
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerUserApplication.class, args);
    }
}
