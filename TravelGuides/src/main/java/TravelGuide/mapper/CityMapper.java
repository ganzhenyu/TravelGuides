package TravelGuide.mapper;

import TravelGuide.entity.City;

import java.util.List;

/**
 * Created by Administrator on 2018/6/10.
 */
public interface CityMapper {
    List<City> getAll();//查询全部城市
    City findById(int id);
    City findByName(String name);
}
