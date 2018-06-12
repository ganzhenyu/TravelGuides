package TravelGuide.entity;

/**
 * Created by Administrator on 2018/6/4.
 */
public class CollectTopic {
    private int id;
    private int topicId;
    private int userId;

    public CollectTopic(){}

    public CollectTopic(int id, int topicId, int userId) {
        this.id = id;
        this.topicId = topicId;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
