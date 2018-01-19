package com.cl.util;

import com.cl.model.Books;
import com.cl.model.Borrow;
import com.cl.model.Manager;
import com.cl.model.Student;
import com.cl.mybatis.mapper.BooksMapper;
import com.cl.mybatis.mapper.BorrowMapper;
import com.cl.mybatis.mapper.ManagerMapper;
import com.cl.mybatis.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.Iterator;
import java.util.List;

public class Crud {
    public static void main(String[] args) {


        Crud crud = new Crud();
        System.out.println(crud.selectAllStudent());
        //System.out.println(crud.selectBorrowByTwo(1602080203,2).toString());
        //System.out.println(crud.deleteBorrow(1602080203,1));
        //System.out.println(crud.insertStudent(1602080220,"闹","78787",19,"女"));
        //System.out.println(crud.updateStudent("122221",1602080203));
        //System.out.println(crud.deleteStudent(1602080203));
        /*Student student;
        student=crud.selectStudent(1);
        if(student==null){
            System.out.println("null");
        }else {
            System.out.println(student.toString());
        }*/
        //Manager manager =null;
        //manager = crud.SelectManager(1);
        //System.out.println(manager.toString());

        //System.out.println(crud.insertBooks(2,"java从入门到放弃","shabpy",50));
        //System.out.println(crud.selectBooks(2).toString());
        //System.out.println(crud.insertBorrow(1602080203,1,"2018-01-11"));
//        List<Borrow> borrow;
//        borrow = crud.selectBorrowByISBN(2);
//        Iterator<Borrow> iter = borrow.iterator();
//        Borrow borrow1;
//        while(iter.hasNext()){
//            borrow1 = iter.next();
//            System.out.println(borrow1.toString());
//        }

        //System.out.println(crud.selectAllBooksNum());
    }

    //下面是对学生表格的增删改查
    public int insertStudent(int SNo,String SName,String SPwd,int SAge,String SSex) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student(SNo, SName, SPwd, SAge, SSex);
        int add = 0;
        {
            try {
                add = mapper.insertStudent(student);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
    public int updateStudent(String SPwd,int SNo) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student();
        student.setSNo(SNo);
        student.setSPwd(SPwd);
        int add = 0;
        {
            try {
                add = mapper.updateStudent(student);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
    public int deleteStudent(int SNo){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int add = 0;
        {
            try {
                add = mapper.deleteStudent(SNo);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public Student selectStudent(int SNo){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        {
            Student student = null;
            try {
                student = mapper.selectStudentById(SNo);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return student;
                //w使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public List<Student> selectAllStudent(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        {
            List<Student> students=null;
            try {
                students = mapper.selectAllStudent();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return students;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }


    // 下面是对manage表的操作



    public int insertManager(int MNo,String MName,String MPwd) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        Manager manager = new Manager(MNo, MName, MPwd);
        int add = 0;
        {
            try {
                add = mapper.insertManager(manager);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
    public int updateManager(String MPwd,int MNo) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        Manager manager = new Manager();
        manager.setMNo(MNo);
        manager.setMPwd(MPwd);
        int add = 0;
        {
            try {
                add = mapper.updateManager(manager);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
    public int deleteManager(int MNo){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        int add = 0;
        {
            try {
                add = mapper.deleteManager(MNo);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public Manager selectManager(int MNo){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        ManagerMapper mapper = sqlSession.getMapper(ManagerMapper.class);
        {
            Manager manager = null;
            try {
                manager = mapper.selectManagerById(MNo);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return manager;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    //下面是对图书的增删改查

    public int insertBooks(int ISBN,String BName,String author,int rest) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        Books books = new Books(ISBN,BName,author,rest);
        int add = 0;
        {
            try {
                add = mapper.insertBooks(books);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public int updateBooks(int ISBN,String BName,String author,int rest) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        Books books = new Books();
        books.setISBN(ISBN);
        books.setBName(BName);
        books.setAuthor(author);
        books.setRest(rest);
        int add = 0;
        {
            try {
                add = mapper.updateBooks(books);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
    public int deleteBooks(int ISBN){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        int add = 0;
        {
            try {
                add = mapper.deleteBooks(ISBN);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public Books selectBooks(int ISBN){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        {
            Books books = null;
            try {
                books = mapper.selectBooksById(ISBN);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return books;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public List<Books> selectAllBooks(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        {
            List<Books> books=null;
            try {
                books = mapper.selectAllBooks();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return books;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    //下面是对借阅记录的增删改查

    public int insertBorrow(int SNo,int ISBN,String time) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);
        Borrow borrow = new Borrow(SNo, ISBN, time);
        int add = 0;
        {
            try {
                add = mapper.insertBorrow(borrow);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
    public int updateBorrow(String time,int SNo,int ISBN) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);
        Borrow borrow = new Borrow();
        borrow.setSNo(SNo);
        borrow.setISBN(ISBN);
        borrow.setTime(time);
        int add = 0;
        {
            try {
                add = mapper.updateBorrow(borrow);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
    public int deleteBorrow(int SNo,int ISBN){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);
        int add = 0;
        {
            try {
                add = mapper.deleteBorrow(SNo,ISBN);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return add;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public List<Borrow> selectBorrowBySNo(int SNo){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);
        {
            List<Borrow> borrow = null;
            try {
                borrow = mapper.selectBorrowBySNo(SNo);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return borrow;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }
    public List<Borrow> selectBorrowByISBN(int ISBN){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);
        {
            List<Borrow> borrow = null;
            try {
                borrow = mapper.selectBorrowByISBN(ISBN);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return borrow;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public Borrow selectBorrowByTwo(int SNo,int ISBN){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);
        {
            Borrow borrow = null;
            try {
                borrow = mapper.selectBorrowByTwo(SNo,ISBN);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return borrow;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public List<Borrow> selectAllBorrow(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        BorrowMapper mapper = sqlSession.getMapper(BorrowMapper.class);
        {
            List<Borrow> borrow = null;
            try {
                borrow = mapper.selectAllBorrow();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sqlSession.close();
                return borrow;
                //使用SqlSession执行完SQL之后需要关闭SqlSession
            }
        }
    }

    public int selectAllBooksNum(){
        int sum=0;
        List<Books> books=this.selectAllBooks();
        Iterator<Books> booksIterator = books.iterator();
        Books books1 = null;
        while (booksIterator.hasNext()){
            books1=booksIterator.next();
            sum+=books1.getRest();
        }
        return sum;
    }





}
