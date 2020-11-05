package com.example.wallpaperapplication.Adepter_item;

public class CateItem {

    public String img, name;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CateItem(String img, String name) {
        this.img = img;
        this.name = name;
    }
}