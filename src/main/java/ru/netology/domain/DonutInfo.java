package ru.netology.domain;

public class DonutInfo {
    private boolean isDonut;            //запись доступна только платным подписчикам VK Donut
    private int privateDuration;        //время, в течение которого запись будет доступна только платным подписчикам VK Donut
    private PlaceholderInfo placeholderInfo;    //заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи
    private boolean canPublishFreeCopy; //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editMode;            //информация о том, какие значения VK Donut можно изменить в записи.

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPrivateDuration() {
        return privateDuration;
    }

    public void setPrivateDuration(int privateDuration) {
        this.privateDuration = privateDuration;
    }

    public PlaceholderInfo getPlaceholder() {
        return placeholderInfo;
    }

    public void setPlaceholder(PlaceholderInfo placeholderInfo) {
        this.placeholderInfo = placeholderInfo;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
