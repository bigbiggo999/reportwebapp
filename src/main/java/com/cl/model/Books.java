package com.cl.model;

public class Books {
    private int ISBN;
    private String BName;
    private String author;
    private int rest;

    public Books(int ISBN, String BName, String author,int rest) {
        this.ISBN = ISBN;
        this.BName = BName;
        this.author=author;
        this.rest = rest;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Books() {
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public int getRest() {
        return rest;
    }

    public int setRest(int rest) {
        if(rest>=0){
            this.rest=rest;
        }
        else {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBN=" + ISBN +
                ", BName=" + BName +
                ", author='" + author + '\'' +
                ", rest=" + rest +
                '}';
    }
}
