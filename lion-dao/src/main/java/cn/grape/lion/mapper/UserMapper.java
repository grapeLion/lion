package cn.grape.lion.mapper;

import cn.grape.lion.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findAll();

    List<User> findAllByPage(@Param("currentPage")int currentPage,@Param("rows")int row);

    int findAllRows();

    List<User> findUserByName(@Param("username")String username,@Param("currentPage")int currentPage,@Param("rows")int row);
}