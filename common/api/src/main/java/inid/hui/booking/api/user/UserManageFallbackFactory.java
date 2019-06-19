package inid.hui.booking.api.user;

import feign.hystrix.FallbackFactory;
import inid.hui.booking.bean.PO.User;
import org.springframework.stereotype.Component;

/**
 * @author ucs_liwenhui
 * @description TODO
 * @date 2019/5/14 15:45
 **/
@Component
public class UserManageFallbackFactory implements UserManageApi {

    @Override
    public User selectOne(User param) {
        User result = new User();
        result.setUserName("该ID：" + param.getUserId() + "没有没有对应的信息");
        return result;
    }
}
