package com.example.wallpaperapplication.Collection;

public class CollectionItem {

    public String name,img,imgone,imgtwo,imgthree;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImgone() {
        return imgone;
    }

    public void setImgone(String imgone) {
        this.imgone = imgone;
    }

    public String getImgtwo() {
        return imgtwo;
    }

    public void setImgtwo(String imgtwo) {
        this.imgtwo = imgtwo;
    }

    public String getImgthree() {
        return imgthree;
    }

    public void setImgthree(String imgthree) {
        this.imgthree = imgthree;
    }

    public CollectionItem(String name, String img, String imgone, String imgtwo, String imgthree) {
        this.name = name;
        this.img = img;
        this.imgone = imgone;
        this.imgtwo = imgtwo;
        this.imgthree = imgthree;
    }
}
