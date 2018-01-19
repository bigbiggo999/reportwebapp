package com.cl.model;

public class Borrow {
    private int SNo;
    private int ISBN;
    private String time;

    public Borrow(int SNo, int ISBN, String time) {
        this.SNo = SNo;
        this.ISBN = ISBN;
        this.time = time;
    }

    public Borrow() {
    }

    public int getSNo() {
        return SNo;
    }

    public void setSNo(int SNo) {
        this.SNo = SNo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Borrow{" +
                "SNo=" + SNo +
                ", ISBN=" + ISBN +
                ", time='" + time + '\'' +
                '}';
    }
}
