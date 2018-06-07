package TravelGuide.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/4.
 */
public class Topic {
    private int id;
    private String title;
    private Date createTime;
    private int status;

    public Topic(int id, String title, Date createTime, int status) {
        this.id = id;
        this.title = title;
        this.createTime = createTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
