package com.example.wallpaperapplication.ViewpagerH;

public class ViewpagerItem {

    public String id,path;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ViewpagerItem(String id, String path) {
        this.id = id;
        this.path = path;
    }
}
