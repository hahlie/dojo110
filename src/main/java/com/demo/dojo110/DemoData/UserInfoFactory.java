package com.demo.dojo110.DemoData;

import com.demo.dojo110.domain.Userinfo;

import java.util.ArrayList;
import java.util.List;

public class UserInfoFactory {
    private static List<Userinfo> userinfos = new ArrayList<>();

    static  {
        for (int i=0; i<10; i++){
            Userinfo userinfo = new Userinfo();
            userinfo.setId(1000+i);
            userinfo.setName("Tom Green_"+i);
            userinfo.setDepartment("Sale_Department_"+i);
            userinfo.setAddress("some street no."+i);
            userinfo.setLevel("level_"+i);
            userinfos.add(userinfo);
        }
    }

    public static List<Userinfo> getUserinfos(){
        return userinfos;
    }
}
