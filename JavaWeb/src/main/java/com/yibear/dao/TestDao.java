package com.yibear.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface TestDao {

    @Result(property = "userName",column = "userName")
    @Select("select userName from person where id = #{i}")
    public String selectUserById(int i) ;
}
