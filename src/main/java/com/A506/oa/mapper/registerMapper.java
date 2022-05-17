package com.A506.oa.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author 凉风
 * @create 2022-05-03 19:18
 */
@Transactional
@Service
public interface registerMapper {
    @Select("select id from user where id=#{id}")
    public Integer findById(Integer id);
    @Insert("insert into user values(#{id},#{username},#{password})")
    public boolean insertData(Integer id,String username,String password);
}
