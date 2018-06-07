package TravelGuide.entity;

/**
 * Created by Administrator on 2018/6/4.
 */
public class District {
    private int id;
    private String name;
    private City city;

    public District(){}

    public District(int id, String name) {
        this.id = id;
        this.name = name;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
