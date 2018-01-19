package com.cl.mybatis.mapper;

import com.cl.model.Student;

import java.util.List;

public interface StudentMapper {
    /**
     * 新增用户
     * @param student
     * @return
     * @throws Exception
     */
    int insertStudent(Student student) throws Exception;

    /**
     * 修改用户
     * @param
     * @return
     * @throws Exception
     */
    int updateStudent(Student student) throws Exception;

    /**
     * 刪除用戶
     * @param SNo
     * @return
     * @throws Exception
     */
    int deleteStudent(Integer SNo) throws Exception;

    /**
     * 根据SNo查询用户信息
     * @param SNo
     * @return
     * @throws Exception
     */
    Student selectStudentById(int SNo) throws Exception;

    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    List<Student> selectAllStudent() throws Exception;
}
