package TravelGuide.web.controller;

import TravelGuide.entity.Topic;
import TravelGuide.mapper.TopicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/6/13.
 */
@RestController
@RequestMapping("/api/topic")
public class TopicController {

    @Autowired
    private TopicMapper topicMapper;

    @RequestMapping("/getAll")
    public List<Topic> getAll(){
        List<Topic> topics = topicMapper.getAll(3);
        return topics;
    }

    @RequestMapping("/topicByUserId")
    public List<Topic> topicByUserId(int userId){
        List<Topic> topicByUserId = topicMapper.fetchByUserId(userId,3);
        return topicByUserId;
    }
}
