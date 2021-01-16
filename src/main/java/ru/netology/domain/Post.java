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
    private int ownerId;                //идентификатор владельца стены
    private int fromId;                 //идентификатор автора записи
    private int createdById;            //идентификатор администратора, который опубликовал запись
    private int replyOwnerId;           //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;            //идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly;            //если запись была создана с опцией «Только для друзей»
    private String postType;            //тип записи
    private int signerId;               //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int postponedId;            //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
    private CopyrightInfo copyrightInfo;//инфо об источнике материала
    private GeoInfo geoInfo;            //инфо о геолокации
    private DonutInfo donutInfo;        //инфо о записи VK Donut


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

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedById() {
        return createdById;
    }

    public void setCreatedById(int createdById) {
        this.createdById = createdById;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public CopyrightInfo getCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(CopyrightInfo copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public DonutInfo getDonutInfo() {
        return donutInfo;
    }

    public void setDonutInfo(DonutInfo donutInfo) {
        this.donutInfo = donutInfo;
    }
}
