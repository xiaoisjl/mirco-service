package inid.hui.booking.consumer.user.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import inid.hui.booking.api.user.UserManageApi;
import inid.hui.booking.bean.PO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ucs_liwenhui
 * @description TODO
 * @date 2019/5/13 17:01
 **/
@RestController
@RequestMapping("user")
public class UserManagerController {

    @Value("${default.password}")
    private String userName;

    @Autowired
    private UserManageApi userManageApi;

    @RequestMapping("selectOne")
    public User getUser(Integer userId) {
        User user = new User();
        user.setUserId(userId);
        return userManageApi.selectOne(user);
    }

    public User defaultStores() {
        return new User();
    }

    @RequestMapping("test")
    public String getUserName() {
        return "名字=" + userName;
    }
}
