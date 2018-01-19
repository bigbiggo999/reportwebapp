package com.cl.mybatis.test;

import com.cl.model.Manager;
import com.cl.mybatis.mapper.ManagerMapper;
import com.cl.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class test1 {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到Manager接口的实现类对象，Manager接口的实现类对象由sqlSession.getMapper(Manager.class)动态构建出来
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        Manager manager = new Manager(001,"嘎子","12221");
        int add=0;
        {
            try {
                add = mapper.insertManager(manager);
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                sqlSession.close();
                System.out.println(add);
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
}
