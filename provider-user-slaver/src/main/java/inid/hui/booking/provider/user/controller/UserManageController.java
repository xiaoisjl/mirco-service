package inid.hui.booking.provider.user.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import inid.hui.booking.api.user.UserManageApi;
import inid.hui.booking.bean.PO.User;
import inid.hui.booking.provider.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ucs_liwenhui
 * @description TODO
 * @date 2019/5/13 16:51
 **/
@RestController
@RequestMapping(value="api")
public class UserManageController implements UserManageApi {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectOne(@RequestBody User param) {
        System.out.println("----------------- slaver --------------------------");
        Wrapper wrapper = new QueryWrapper(param);
        return userMapper.selectOne(wrapper);
    }
}
