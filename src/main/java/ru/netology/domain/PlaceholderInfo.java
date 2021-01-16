package ru.netology.domain;

public class PlaceholderInfo {

    //в документации нет описания этого объекта, я предположил, что он может выглядеть вот так

    private int id;             //id заглушки
    private String type;        //тип заглушки
    private String link;        //ссылка на заглушку

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
