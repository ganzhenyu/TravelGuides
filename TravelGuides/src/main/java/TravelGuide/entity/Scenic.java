package TravelGuide.entity;

import TravelGuide.web.util.ConvertTime;

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
    private int love;
    private String path;
    private int browse;
    private User user;
    private int status;

    public Scenic(){}

    public Scenic(int id, String name, String title, String address, float price, Date createTime, Date endTime, String intro, int love, String path, int browse, int status) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.address = address;
        this.price = price;
        this.createTime = createTime;
        this.endTime = endTime;
        this.intro = intro;
        this.love = love;
        this.path = path;
        this.browse = browse;
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

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getBrowse() {
        return browse;
    }

    public void setBrowse(int browse) {
        this.browse = browse;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateTimeLong(){
        if (this.createTime==null)
            return null;
        String time = ConvertTime.DateToLongStr(this.createTime);
        return time;
    }

    public String getEndTimeLong(){
        if (this.endTime==null)
            return null;
        String time = ConvertTime.DateToLongStr(this.endTime);
        return time;
    }

    public String getCreateTimeShort(){
        if (this.createTime==null)
            return null;
        String time = ConvertTime.DateToShortStr(this.createTime);
        return time;
    }

    public String getEndTimeShort(){
        if (this.endTime==null)
            return null;
        String time = ConvertTime.DateToShortStr(this.endTime);
        return time;
    }
}