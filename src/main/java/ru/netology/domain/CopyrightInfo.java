package ru.netology.domain;

public class CopyrightInfo {
    private int id;             //id источника
    private String link;        //ссылка на источник
    private String name;        //имя источника
    private String type;        //тип источника

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
