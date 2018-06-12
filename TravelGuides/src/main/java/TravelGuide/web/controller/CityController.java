package TravelGuide.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TravelGuide.entity.City;
import TravelGuide.mapper.CityMapper;

@RestController
@RequestMapping("/api/city")
public class CityController {
	
	@Autowired
    private CityMapper cityMapper;
	
	@RequestMapping("/list")
	public List<City> getAll(){
		List<City> citylist=cityMapper.getAll();
		return citylist;
	}
	@RequestMapping("/{id}")
	public City findById(@PathVariable int id){
		City city=cityMapper.findById(id);
		return city;
	}
	@RequestMapping("")
	public City findByName(String name){
		City city=cityMapper.findByName(name);
		return city;
	}
}
