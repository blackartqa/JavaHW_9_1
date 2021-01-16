package ru.netology.domain;

public class LikesInfo {
    private int count;          //количество лайков
    private boolean userLike;   //наличие лайка от текущего пользователя
    private boolean canBeLike;  //может ли поставить лайк текущий пользователь

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLike() {
        return userLike;
    }

    public void setUserLike(boolean userLike) {
        this.userLike = userLike;
    }

    public boolean isCanBeLike() {
        return canBeLike;
    }

    public void setCanBeLike(boolean canBeLike) {
        this.canBeLike = canBeLike;
    }
}
