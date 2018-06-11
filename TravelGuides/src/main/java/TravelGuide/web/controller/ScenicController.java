package TravelGuide.web.controller;

import TravelGuide.entity.Scenic;
import TravelGuide.mapper.ScenicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/11.
 */
@Controller
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

    @GetMapping("/scenicByEvaluate")
    public List<Scenic> scenicByEvaluate(){
        List<Scenic> scenicByEvaluate = scenicMapper.fetchByEvaluate(3);
        return scenicByEvaluate;
    }
}
