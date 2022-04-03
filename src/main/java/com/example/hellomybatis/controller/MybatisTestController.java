package com.example.hellomybatis.controller;

import com.example.hellomybatis.entity.TUser;
import com.example.hellomybatis.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MybatisTestController {

    private TUserMapper tUserMapper;

    @Autowired
    public MybatisTestController(TUserMapper tUserMapper){
        this.tUserMapper = tUserMapper;
    }

    @GetMapping("/getTest")
//    public List<Map<String, Object>> getTest(){
    public List<TUser> getTest(){

        return tUserMapper.selectUserList();
    }
}
