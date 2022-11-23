package com.example.remakedemorv.modal;

public class products {
    private String name;
    private String description;
    private int imageView;

    public products(String name, String description, int imageView) {
        this.name = name;
        this.description = description;
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }


}
