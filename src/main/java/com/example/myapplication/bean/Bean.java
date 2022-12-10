package com.example.myapplication.bean;

import java.io.Serializable;

//数据存储包
public class Bean implements Serializable {
    private  String title;
    private  String cont;
    private  String time;
    private  int img;

    public Bean(){

    }

    public Bean(String title,String cont,String time,int img){
        this.title=title;
        this.img=img;
        this.time=time;
        this.cont=cont;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "title='" + title + '\'' +
                ", cont='" + cont + '\'' +
                ", time='" + time + '\'' +
                ", img=" + img +
                '}';
    }
}
