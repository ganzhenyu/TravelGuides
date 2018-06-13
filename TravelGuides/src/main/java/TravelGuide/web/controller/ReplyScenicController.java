package TravelGuide.web.controller;

import TravelGuide.entity.ReplyScenic;
import TravelGuide.mapper.ReplyScenicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/6/13.
 */
@RestController
@RequestMapping("/api/replyScenic")
public class ReplyScenicController {

    @Autowired
    private ReplyScenicMapper replyScenicMapper;

    @RequestMapping("/fetchByScenicId")
    public List<ReplyScenic> fetchByScenicId(int scenicId){
        List<ReplyScenic> replyScenicByScenicId = replyScenicMapper.fetchByScenicId(scenicId);
        return replyScenicByScenicId;
    }

    @PostMapping("/addReplyScenic")
    public void addReplyScenic(int scenicId,ReplyScenic replyScenic){
        replyScenicMapper.add(scenicId,replyScenic);
    }
}
