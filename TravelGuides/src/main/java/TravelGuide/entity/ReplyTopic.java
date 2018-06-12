package TravelGuide.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/4.
 */
public class ReplyTopic {
    private int id;
    private int topicId;
    private Date createTime;
    private String content;
    private User user;

    public ReplyTopic(){}

    public ReplyTopic(int id, int topicId, Date createTime, String content) {
        this.id = id;
        this.topicId = topicId;
        this.createTime = createTime;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}