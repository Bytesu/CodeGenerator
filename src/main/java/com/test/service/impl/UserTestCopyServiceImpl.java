package com.test.service.impl;

import com.test.mapper.UserTestCopyMapper;
import com.test.entity.UserTestCopy;
import com.test.service.UserTestCopyService;
import com.bigsea.sns.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by byte_su@163.com on 2017/11/26.
 */
@Service
public class UserTestCopyServiceImpl extends AbstractService<UserTestCopy> implements UserTestCopyService {

    @Autowired
    private UserTestCopyMapper userTestCopyMapper;

}
