package com.test.service.impl;

import com.test.mapper.UserMapper;
import com.test.entity.User;
import com.test.service.UserService;
import com.bigsea.sns.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by byte_su@163.com on 2017/11/26.
 */
@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

}
