package TravelGuide.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/5.
 */
public class Scenic {
    private int id;
    private String name;
    private String title;
    private District district;
    private String address;
    private float price;
    private Date createTime;
    private Date endTime;
    private String intro;
    private int status;

    public Scenic(int id, String name, String title, String address, float price, Date createTime, Date endTime, String intro, int status) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.address = address;
        this.price = price;
        this.createTime = createTime;
        this.endTime = endTime;
        this.intro = intro;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}