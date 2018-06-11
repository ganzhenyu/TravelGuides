package TravelGuide.web.controller;

import TravelGuide.mapper.ScenicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/11.
 */
@Controller
@RequestMapping("/api")
public class ScenicController {

    @Autowired
    private ScenicMapper scenicMapper;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("scenicByEndTime",scenicMapper.fetchByEndTime(3));
        model.addAttribute("scenicByLove",scenicMapper.fetchByLove(3));
        model.addAttribute("scenicByEvaluate",scenicMapper.fetchByEvaluate(3));
        return "index";
    }

}
