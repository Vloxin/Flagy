package com.example.flagy;

public class Flag {
    private String name;
    private int imgSrc;
    private Boolean answer;
    private String st;

    public Flag(String name, int imgSrc, Boolean answer,String st ) {
        this.name = name;
        this.imgSrc = imgSrc;
        this.answer = answer;
        this.st=st;

    }

    public Flag() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgSrc() {
        return imgSrc;
    }
    public String getst(){
        return st;
    }
    public void setst(String st){this.st=st;}

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

    public Boolean getAnswer() {
        return answer;
    }


    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }
}
