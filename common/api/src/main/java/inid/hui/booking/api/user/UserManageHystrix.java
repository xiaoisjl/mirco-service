package inid.hui.booking.api.user;

import inid.hui.booking.bean.PO.User;
import org.springframework.stereotype.Component;

/**
 * @author ucs_liwenhui
 * @description TODO
 * @date 2019/5/14 16:47
 **/
@Component
public class UserManageHystrix implements UserManageApi {
    @Override
    public User selectOne(User param) {
        return new User();
    }
}
