package TravelGuide.web.controller;

import TravelGuide.entity.Scenic;
import TravelGuide.mapper.ScenicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/11.
 */
@RestController
@RequestMapping("/api/scenic")
public class ScenicController {

    @Autowired
    private ScenicMapper scenicMapper;

    @GetMapping("/scenicByEndTime")
    public List<Scenic> scenicByEndTime(){
        List<Scenic> scenicByEndTime = scenicMapper.fetchByEndTime(3);
        return scenicByEndTime;
    }

    @GetMapping("/scenicByLove")
    public List<Scenic> scenicByLove(){
        List<Scenic> scenicByLove = scenicMapper.fetchByLove(3);
        return scenicByLove;
    }

    @GetMapping("/scenicByBrowse")
    public List<Scenic> scenicByBrowse(){
        List<Scenic> scenicByBrowse = scenicMapper.fetchByBrowse(3);
        return scenicByBrowse;
    }

    @RequestMapping("/scenicByCityId")
    public List<Scenic> scenicByCityId(int cityId){
        List<Scenic> scenicByCityId = scenicMapper.fetchByCityId(cityId);
        return scenicByCityId;
    }

    @RequestMapping("/scenicByCollect")
    public List<Scenic> scenicByCollect(int userId){
        List<Scenic> scenicByCollect = scenicMapper.fetchByCollect(userId,3);
        return scenicByCollect;
    }

    @RequestMapping("/scenicById")
    public Scenic scenicById(int id){
        Scenic scenicById = scenicMapper.fetchById(id);
        return scenicById;
    }
}
