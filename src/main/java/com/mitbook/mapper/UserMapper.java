package com.mitbook.mapper;
import com.mitbook.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author pengzhengfa
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    User selectAll();
}