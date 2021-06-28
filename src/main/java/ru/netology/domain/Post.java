package ru.netology.domain;

public class Post {
    private int postId;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int postDate;
    private int postponedId;
    private int geoId;
    private String text;
    private boolean friendsOnly;
    private int viewsCount;
    private int likesCount;
    private int repostsCount;
    private int commentsCount;
    private boolean  isPinned;
    private boolean  markedAsAds;
    private boolean  canBeViewedByDonutOnly;
    private CommentsInfo commentsInfo;

    // + get/set на все поля
}
