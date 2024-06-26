package com.example.entity;

import javax.persistence.*;

@Table(name = "comment_info")
public class CommentInfo {
    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 意见内容
     */
    private String content;

    /**
     * 所属考核
     */
    @Column(name = "goodsId")
    private Long goodsId;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private String createTime;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "level")
    private Integer level;

    @Transient
    private String goodsName;

    @Transient
    private String userName;

    /**
     * 获取自增id
     *
     * @return id - 自增id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增id
     *
     * @param id 自增id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取意见内容
     *
     * @return content - 意见内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置意见内容
     *
     * @param content 意见内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取所属考核
     *
     * @return goodsId - 所属考核
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * 设置所属考核
     *
     * @param goodsId 所属考核
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
