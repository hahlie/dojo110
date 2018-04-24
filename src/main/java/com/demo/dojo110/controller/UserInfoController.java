package com.demo.dojo110.controller;

import com.demo.dojo110.DemoData.UserInfoFactory;
import com.demo.dojo110.domain.Userinfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @GetMapping("/list")
    public List<Userinfo> list(){
        return UserInfoFactory.getUserinfos();
    }
}
