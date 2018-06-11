package TravelGuide.mapper;

import TravelGuide.entity.User;

/**
 * Created by Administrator on 2018/6/5.
 */
public interface UserMapper {
    User UserLogin(String username,String password);//登录
    User fetchById(int id);//根据id查找用户
    void update(User user);//更新用户信息
}
