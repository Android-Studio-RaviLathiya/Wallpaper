package com.example.wallpaperapplication.ViewpagerV;

public class ViewpagerVitem {

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

    public ViewpagerVitem(String id, String path) {
        this.id = id;
        this.path = path;
    }
}
