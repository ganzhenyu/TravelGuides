package TravelGuide.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/4.
 */
public class ReplyScenic {
    private int id;
    private String content;
    private Date createTime;
    private int scenicId;

    public ReplyScenic(){}

    public ReplyScenic(int id, String content, Date createTime, int scenicId) {
        this.id = id;
        this.content = content;
        this.createTime = createTime;
        this.scenicId = scenicId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getScenicId() {
        return scenicId;
    }

    public void setScenicId(int scenicId) {
        this.scenicId = scenicId;
    }
}