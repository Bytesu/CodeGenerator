package com.test.controller;
import com.test.entity.UserTestCopy;
import com.test.service.UserTestCopyService;
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
@RequestMapping("/userTestCopy/")
public class UserTestCopyController {

    @Autowired
    UserTestCopyService userTestCopyService;

    @RequestMapping("add")
    @ResponseBody
    public String add(UserTestCopy userTestCopy) {
        userTestCopyService.save(userTestCopy);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    userTestCopyService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(UserTestCopy userTestCopy) {
	    userTestCopyService.update(userTestCopy);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        UserTestCopy userTestCopy = userTestCopyService.findById(id);
        return userTestCopy.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserTestCopy> list = userTestCopyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return list.toString();
    }
}
