package TravelGuide.mapper;

import TravelGuide.entity.User;

/**
 * Created by Administrator on 2018/6/5.
 */
public interface UserMapper {
    User UserLogin(String username,String password);
}
