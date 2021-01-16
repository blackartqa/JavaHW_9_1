package ru.netology.domain;

public class MediaPost {
    private int idMedia;      //id медиа
    private String linkMedia; //ссылка на медиа

    public int getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    public String getLinkMedia() {
        return linkMedia;
    }

    public void setLinkMedia(String linkMedia) {
        this.linkMedia = linkMedia;
    }
}
