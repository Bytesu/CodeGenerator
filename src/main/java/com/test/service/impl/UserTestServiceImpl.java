package com.test.service.impl;

import com.test.mapper.UserTestMapper;
import com.test.entity.UserTest;
import com.test.service.UserTestService;
import com.bigsea.sns.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by byte_su@163.com on 2017/11/26.
 */
@Service
public class UserTestServiceImpl extends AbstractService<UserTest> implements UserTestService {

    @Autowired
    private UserTestMapper userTestMapper;

}
