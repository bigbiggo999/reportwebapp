package com.cl.model;

public class Student {
    private String SName;
    private int SNo;
    private String SPwd;
    private int SAge;
    private String SSex;

    public Student( int SNo,String SName, String SPwd, int SAge, String SSex) {
        this.SName = SName;
        this.SNo = SNo;
        this.SPwd = SPwd;
        this.SAge = SAge;
        this.SSex = SSex;
    }

    public Student() {
    }

    public int getSAge() {
        return SAge;
    }

    public void setSAge(int sage) {
        SAge = sage;
    }

    public String getSSex() {
        return SSex;
    }

    public void setSSex(String SSex) {
        this.SSex = SSex;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public int getSNo() {
        return SNo;
    }

    public void setSNo(int SNo) {
        this.SNo = SNo;
    }

    public String getSPwd() {
        return SPwd;
    }

    public void setSPwd(String SPwd) {
        this.SPwd = SPwd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "SName='" + SName + '\'' +
                ", SNo=" + SNo +
                ", SPwd='" + SPwd + '\'' +
                ", SAge='" + SAge + '\'' +
                ", SSex='" + SSex + '\'' +
                '}';
    }
}
