package TravelGuide.web.controller;

import TravelGuide.entity.User;
import TravelGuide.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/13.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/UserLogin")
    public User UserLogin(String username,String password){
        User user = userMapper.UserLogin(username,password);
        if (user != null){
            return user;
        }else{
            return null;
        }
    }

    @RequestMapping("/userById")
    public User fetchById(int id){
        User user = userMapper.fetchById(id);
        return user;
    }

    @RequestMapping("/updateUser")
    public void updateUser(User user){
        userMapper.update(user);
    }
}
