package inid.hui.booking.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ucs_liwenhui
 * @description TODO
 * @date 2019/5/13 13:56
 **/

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderUserApplication.class, args);
    }
}
