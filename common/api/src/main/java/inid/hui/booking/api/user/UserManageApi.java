package inid.hui.booking.api.user;

import inid.hui.booking.bean.PO.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "PROVIDER-USER/api", fallback = UserManageFallbackFactory.class)
public interface UserManageApi {

    @RequestMapping(value = "/UserManageApi/selectOne", method = RequestMethod.POST, consumes = "application/json")
    User selectOne(@RequestBody User param);

    default User defaultStores() {
        return new User();
    }
}
