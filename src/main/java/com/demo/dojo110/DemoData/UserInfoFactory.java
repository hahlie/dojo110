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

    public synchronized static void deleteUserInfoById(long id){
        for(Userinfo userinfo: userinfos){
            if(userinfo.getId() == id){
                userinfos.remove(userinfo);
                return;
            }
        }
    }

    public synchronized static void updateUserInfoById(Userinfo userinfo){
        if(null != userinfo){
            for(Userinfo info: userinfos){
                if(info.getId() == userinfo.getId()){
                    info.setName(userinfo.getName());
                    info.setAddress(userinfo.getAddress());
                    info.setDepartment(userinfo.getDepartment());
                    info.setLevel(userinfo.getLevel());
                    return;
                }
            }
        }
    }

    public synchronized static void addUserInfo(Userinfo userinfo){
        if(null != userinfo){
            userinfo.setId(initId());
            userinfos.add(userinfo);
        }
    }

    private synchronized static long initId(){
        long max = 0l;
        for(Userinfo info: userinfos){
            if(info.getId() > max){
                max = info.getId();
            }
        }
        return max++;
    }
}
