package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.mapper.UserMapper;
import com.codepresso.codepressoblog.vo.User;
import com.codepresso.codepressoblog.vo.UserSession;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserMapper userMapper;

    public boolean signup(User user) {
        Integer result = userMapper.signup(user);
        return result == 1;
    }

    public User login(User user) {
        User resultUser = userMapper.login(user);
        return resultUser;
    }

    public boolean createSession(User user) {
        Integer result = userMapper.createSession(user);
        return result == 1;
    }

    public UserSession createCookie(User user) {
        UserSession resultSession = userMapper.createCookie(user);
        return resultSession;
    }

    public boolean logout(Integer id) {
        Integer result = userMapper.logout(id);
        return result == 1;
    }

}
