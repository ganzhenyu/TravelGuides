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
@RequestMapping("/api")
public class ScenicController {

    @Autowired
    private ScenicMapper scenicMapper;

    @GetMapping("/index")
    public Map<String,Object> index(){
        Map<String,Object> map = new HashMap<>();
        List<Scenic> scenicByEndTime = scenicMapper.fetchByEndTime(3);
        List<Scenic> scenicByLove = scenicMapper.fetchByEndTime(3);
        List<Scenic> scenicByEvaluate = scenicMapper.fetchByEndTime(3);
        map.put("scenicByEndTime",scenicByEndTime);
        map.put("scenicByLove",scenicByLove);
        map.put("scenicByEvaluate",scenicByEvaluate);
        return map;
    }

}
