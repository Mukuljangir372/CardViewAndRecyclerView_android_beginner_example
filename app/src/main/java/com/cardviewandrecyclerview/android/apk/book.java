package com.cardviewandrecyclerview.android.apk;

public class book {
    private String Title;
    private String description;
    private String category;
    private int thumbnail;

    public book(String title, String description, String category, int thumbnail) {
        Title = title;
        this.description = description;
        this.category = category;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
