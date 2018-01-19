package com.cl.mybatis.mapper;

import com.cl.model.Books;

import java.util.List;

public interface BooksMapper {
    /**
     * 新增图书
     * @param books
     * @return
     * @throws Exception
     */
    int insertBooks(Books books) throws Exception;

    /**
     * 修改图书信息
     * @param
     * @return
     * @throws Exception
     */
    int updateBooks(Books books) throws Exception;

    /**
     * 刪除图书
     * @param ISBN
     * @return
     * @throws Exception
     */
    int deleteBooks(Integer ISBN) throws Exception;

    /**
     * 根据SNo查询用户信息
     * @param ISBN
     * @return
     * @throws Exception
     */
    Books selectBooksById(int ISBN) throws Exception;

    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    List<Books> selectAllBooks() throws Exception;
}
