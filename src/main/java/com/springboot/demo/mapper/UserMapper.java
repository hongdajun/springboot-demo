package com.springboot.demo.mapper;

import com.springboot.demo.data.Pms_user;
import com.springboot.demo.data.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface UserMapper {
    @Select("select name from user where name = #{name} and password = #{password}")
    public String login(@Param("name") String name,@Param("password") String password);

    /**
     * 用户列表查询
     * @return
     */
    @Select("select * from pms_user")
    List<Map>  getList();

    /**
     * 获取总数量
     * @return
     */
    int getPageCount(Map map);

    /**
     * 用户添加
     * @param map
     * @return
     */
    int insertUser(Map map);

    /**
     * 实现模糊查询
     * @param paramMap
     * @return
     */
    List<Map> selectUserBy(Map paramMap);

    /**
     * 更新
     * @param map
     * @return
     */
    int updateUserMsg(Map map);

    /**
     * 删除
     * @param map
     * @return
     */
    int deleteOne(Map map);




}
