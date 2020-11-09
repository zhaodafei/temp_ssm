package com.dafei.dao;

import com.dafei.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserDao {

    // 查询一条数据
    // User selectUser(long id);
    User selectUser(@Param("id") long id);

    /**
     *  和 mapper/UserMapper.xml 中的id="selectUserFoo"  对应
     *  在 com/dafei/service/impl/UserServiceImpl.java 中使用
     * @param id
     * @return
     */
    // User selectUserFoo(long id);

    // 查询所有数据
    List<User> selectAllUser();

    // 添加
    // void save(User user);
    void save(@RequestBody User user);

    // 修改
    // int update(User user);
    int update(@RequestBody User user);

    // 删除
    // boolean delete(int id);
    boolean delete(@Param("id") int id);

}
