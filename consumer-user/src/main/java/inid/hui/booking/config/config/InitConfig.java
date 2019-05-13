package inid.hui.booking.config.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author ucs_liwenhui
 * @description TODO
 * @date 2019/5/13 10:19
 **/
@Component
public class InitConfig implements ApplicationRunner {

    @Value("${name}")
    private String userName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("------userName------" + userName);
    }
}
