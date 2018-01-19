package com.cl.mybatis.mapper;

import com.cl.model.Manager;

import java.util.List;

public interface ManagerMapper {
    /**
     * 新增用户
     * @param manager
     * @return
     * @throws Exception
     */
    int insertManager(Manager manager) throws Exception;

    /**
     * 修改用户
     * @param
     * @return
     * @throws Exception
     */
    int updateManager(Manager manager) throws Exception;

    /**
     * 刪除用戶
     * @param MNo
     * @return
     * @throws Exception
     */
    int deleteManager(Integer MNo) throws Exception;

    /**
     * 根据SNo查询用户信息
     * @param MNo
     * @return
     * @throws Exception
     */
    Manager selectManagerById(int MNo) throws Exception;

    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    List<Manager> selectAllManager() throws Exception;
}
