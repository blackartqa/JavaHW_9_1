package ru.netology.domain;

public class Post {
    private int id;                     //id поста
    private String link;                //ссылка на пост
    private int ownerID;                //владелец поста
    private String header;              //заголовок поста
    private int dateTime;               //дата и время поста
    private boolean pinnedPost;         //закреплённый пост
    private String text;                //текст поста
    private boolean media;              //наличие или отсутствие медиа в посте
    private MediaPost mediaPost;        //инфо о медиа
    private boolean canBeComments;      //разрешено ли комментировать пост
    private CommentsInfo commentsInfo;  //инфо о комментарии
    private LikesInfo likesInfo;        //инфо о лайках
    private RepostsInfo repostsInfo;    //инфо о репостах
    private int views;                  //количество просмотров


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

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getDateTime() {
        return dateTime;
    }

    public void setDateTime(int dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isPinnedPost() {
        return pinnedPost;
    }

    public void setPinnedPost(boolean pinnedPost) {
        this.pinnedPost = pinnedPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isMedia() {
        return media;
    }

    public void setMedia(boolean media) {
        this.media = media;
    }

    public MediaPost getMediaPost() {
        return mediaPost;
    }

    public void setMediaPost(MediaPost mediaPost) {
        this.mediaPost = mediaPost;
    }

    public boolean isCanBeComments() {
        return canBeComments;
    }

    public void setCanBeComments(boolean canBeComments) {
        this.canBeComments = canBeComments;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
