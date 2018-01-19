package com.cl.mybatis.mapper;

import com.cl.model.Borrow;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BorrowMapper {
    /**
     * 新增借书记录
     * @param borrow
     * @return
     * @throws Exception
     */
    int insertBorrow(Borrow borrow) throws Exception;

    /**
     * 修改借书信息
     * @param borrow
     * @return
     * @throws Exception
     */
    int updateBorrow(Borrow borrow) throws Exception;

    /**
     * 刪除借书记录
     * @param SNo
     * @param ISBN
     * @return
     * @throws Exception
     */
    int deleteBorrow(@Param("SNo") Integer SNo,@Param("ISBN") Integer ISBN) throws Exception;

    /**
     * 根据SNo查询借书信息
     * @return
     * @throws Exception
     */
    List<Borrow> selectBorrowBySNo(int SNo) throws Exception;

    /**
     * 根据ISBN查询用户信息
     * @param ISBN
     * @return
     * @throws Exception
     */
    List<Borrow> selectBorrowByISBN(int ISBN) throws Exception;

    /**
     * 根据SNo和ISBN查询用户信息
     * @param SNo
     * @param ISBN
     * @return
     * @throws Exception
     */
    Borrow selectBorrowByTwo(@Param("SNo") int SNo,@Param("ISBN") int ISBN) throws Exception;

    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    List<Borrow> selectAllBorrow() throws Exception;
}
