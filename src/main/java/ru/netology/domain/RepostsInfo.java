package ru.netology.domain;

public class RepostsInfo {
    private int count;              //количество репостов
    private boolean userRepost;     //наличие репоста от текущего пользователя
    private boolean canBeRepost;    //может ли пользователь сделать репост

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserRepost() {
        return userRepost;
    }

    public void setUserRepost(boolean userRepost) {
        this.userRepost = userRepost;
    }

    public boolean isCanBeRepost() {
        return canBeRepost;
    }

    public void setCanBeRepost(boolean canBeRepost) {
        this.canBeRepost = canBeRepost;
    }
}
