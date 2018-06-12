package TravelGuide.entity;

/**
 * Created by Administrator on 2018/6/4.
 */
public class CollectScenic {
    private int id;
    private int scenicId;
    private int userId;

    public CollectScenic(){}

    public CollectScenic(int id, int scenicId, int userId) {
        this.id = id;
        this.scenicId = scenicId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScenicId() {
        return scenicId;
    }

    public void setScenicId(int scenicId) {
        this.scenicId = scenicId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
