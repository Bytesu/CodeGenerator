package com.test.service.impl.demo;

import com.test.mapper.demo.TestDemoUserMapper;
import com.test.entity.demo.TestDemoUser;
import com.test.service.demo.TestDemoUserService;
import com.bigsea.sns.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by byte_su@163.com on 2017/11/25.
 */
@Service
public class TestDemoUserServiceImpl extends AbstractService<TestDemoUser> implements TestDemoUserService {

    @Autowired
    private TestDemoUserMapper testDemoUserMapper;

}
