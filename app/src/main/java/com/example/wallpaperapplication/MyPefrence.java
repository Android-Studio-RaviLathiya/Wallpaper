package com.example.wallpaperapplication;

import android.app.Application;
import android.content.SharedPreferences;

import com.example.wallpaperapplication.Adepter_item.ListItem;
import com.example.wallpaperapplication.Adepter_item.ListSItem;
import com.example.wallpaperapplication.Adepter_item.ListVItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

public class MyPefrence extends Application {

    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor editor;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedPreferences = getSharedPreferences("my", MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }







    public static void  setlist(ArrayList<ListItem> listItems) {
        Gson gson = new Gson();
        String data = gson.toJson(listItems);
        editor.putString("list", data).commit();
    }

    public static ArrayList<ListItem> getlist() {
        Gson gson = new Gson();
        String data = sharedPreferences.getString("list", null);
        ArrayList<ListItem> list = gson.fromJson(data, new TypeToken<List<ListItem>>() {
        }.getType());
        return list;
    }

    public static void setlistv(ArrayList<ListVItem> listVItems) {
        Gson gson = new Gson();
        String data = gson.toJson(listVItems);
        editor.putString("listv", data).commit();
    }

    public static ArrayList<ListVItem> getlistv() {
        Gson gson = new Gson();
        String data = sharedPreferences.getString("listv", null);
        ArrayList<ListVItem> listv = gson.fromJson(data, new TypeToken<List<ListVItem>>() {
        }.getType());
        return listv;
    }
 public static void setlists(ArrayList<ListSItem> listSItems) {
        Gson gson = new Gson();
        String data = gson.toJson(listSItems);
        editor.putString("lists", data).commit();
    }

    public static ArrayList<ListSItem> getlists() {
        Gson gson = new Gson();
        String data = sharedPreferences.getString("lists", null);
        ArrayList<ListSItem> lists = gson.fromJson(data, new TypeToken<List<ListSItem>>() {
        }.getType());
        return lists;
    }



}
