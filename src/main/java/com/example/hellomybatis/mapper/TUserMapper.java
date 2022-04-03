package com.example.hellomybatis.mapper;

import com.example.hellomybatis.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TUserMapper {

    List<TUser> selectUserList();
}
