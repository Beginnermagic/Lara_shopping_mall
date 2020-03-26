package com.laola.gamll.user.service.impl;

import com.laola.gamll.user.mapper.UserMapper;
import com.laola.gamll.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl  implements UserService {
    @Resource
    UserMapper UserMapper;
}
