package com.codepresso.codepressoblog.mapper;

import com.codepresso.codepressoblog.vo.User;
import com.codepresso.codepressoblog.vo.UserSession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    Integer signup(@Param("user") User user);
    User login(@Param("user") User user);
    Integer createSession(@Param("user") User user);
    UserSession createCookie(@Param("user") User user);
    Integer logout(@Param("id") Integer id);
}
