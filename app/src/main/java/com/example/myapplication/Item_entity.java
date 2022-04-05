package com.example.myapplication;

public class Item_entity {
    private String name;
    private String coment;
    private int img;

    public Item_entity(String name, String coment, int img) {
        this.name = name;
        this.coment = coment;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
