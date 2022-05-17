package com.A506.oa.web;

import com.A506.oa.common.Result;
import com.A506.oa.mapper.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 凉风
 * @create 2022-05-03 19:11
 */
@RestController
public class UserController {
    @Resource
    registerMapper reMa;
    @GetMapping("/register")
    public boolean register(int id,String username,String password){
        if(reMa.findById(id)==null){
            return reMa.insertData(id,username,password);
        }
        return false;
    }

    @Resource
    groundMapper groundMapper;
    @GetMapping("/ground")
    public List<Result> ground(String year, String object){
        return groundMapper.searchGrand(year,object);
    }
}
