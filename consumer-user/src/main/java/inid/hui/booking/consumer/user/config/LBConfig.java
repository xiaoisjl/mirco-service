package inid.hui.booking.consumer.user.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;

/**
 * @author ucs_liwenhui
 * @description TODO
 * @date 2019/6/19 16:50
 **/
@RibbonClient(name="PROVIDER-USER", configuration=LBConfig.class)
public class LBConfig {

    @Bean
    public IRule getRule(){
        return new RandomRule();
    }
}
