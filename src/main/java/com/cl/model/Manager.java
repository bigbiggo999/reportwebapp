package com.cl.model;

public class Manager {
    private String MName=null;
    private int MNo;
    private String MPwd;

    public Manager( int MNo,String MName, String MPwd) {
        this.MName = MName;
        this.MNo = MNo;
        this.MPwd = MPwd;
    }

    public Manager() {
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public int getMNo() {
        return MNo;
    }

    public void setMNo(int MNo) {
        this.MNo = MNo;
    }

    public String getMPwd() {
        return MPwd;
    }

    public void setMPwd(String MPwd) {
        this.MPwd=MPwd;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "MName='" + MName + '\'' +
                ", MNo=" + MNo +
                ", MPwd='" + MPwd + '\'' +
                '}';
    }
}
