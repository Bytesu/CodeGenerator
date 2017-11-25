package com.test.web.controller.demo;
import com.test.entity.demo.TestDemoUser;
import com.test.service.demo.TestDemoUserService;
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
 * Created by byte_su@163.com on 2017/11/25.
 */
@Controller
@RequestMapping("/testDemoUser/")
public class TestDemoUserController {

    @Autowired
    TestDemoUserService testDemoUserService;

    @RequestMapping("add")
    @ResponseBody
    public String add(TestDemoUser testDemoUser) {
        testDemoUserService.save(testDemoUser);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    testDemoUserService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(TestDemoUser testDemoUser) {
	    testDemoUserService.update(testDemoUser);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        TestDemoUser testDemoUser = testDemoUserService.findById(id);
        return testDemoUser.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TestDemoUser> list = testDemoUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
