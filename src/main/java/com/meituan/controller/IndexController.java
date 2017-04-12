package com.meituan.controller;

import com.meituan.domain.Test;
import com.meituan.mapper.TestMapper;
import org.aspectj.apache.bcel.util.ClassLoaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangyuanxin on 2017/4/12.
 */
@RestController
public class IndexController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String printHello(Model model) {
        return "helloWorld";
    }

    @Autowired
    private TestMapper testMapper;

    @RequestMapping(value = "name", method = RequestMethod.GET)
    public String name() {
        Map<String, Object> map = new HashMap();
        List<Test> list = testMapper.findAll(map);
        return list.get(0).getName() + list.get(0).getId();

    }
}
