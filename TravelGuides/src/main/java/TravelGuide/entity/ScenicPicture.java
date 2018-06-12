package TravelGuide.entity;

/**
 * Created by Administrator on 2018/6/4.
 */
public class ScenicPicture {
    private int id;
    private int scenicId;
    private String picture;

    public ScenicPicture(){}

    public ScenicPicture(int id, int scenicId, String picture) {
        this.id = id;
        this.scenicId = scenicId;
        this.picture = picture;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
