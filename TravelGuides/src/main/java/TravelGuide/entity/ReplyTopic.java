package TravelGuide.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/4.
 */
public class ReplyTopic {
    private int id;
    private int topicId;
    private Date createTime;
    private User user;

    public ReplyTopic(int id, int topicId, Date createTime) {
        this.id = id;
        this.topicId = topicId;
        this.createTime = createTime;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
