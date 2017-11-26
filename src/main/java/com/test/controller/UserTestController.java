package com.test.controller;
import com.test.entity.UserTest;
import com.test.service.UserTestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * Created by byte_su@163.com on 2017/11/26.
 */
@Controller
@RequestMapping("/userTest/")
public class UserTestController {

    @Autowired
    UserTestService userTestService;

    @RequestMapping("add")
    @ResponseBody
    public String add(UserTest userTest) {
        userTestService.save(userTest);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    userTestService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(UserTest userTest) {
	    userTestService.update(userTest);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        UserTest userTest = userTestService.findById(id);
        return userTest.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserTest> list = userTestService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
