package TravelGuide.mapper;

import TravelGuide.entity.Topic;

import java.util.List;

/**
 * Created by Administrator on 2018/6/10.
 */
public interface TopicMapper {
    List<Topic> getAll(int rows);//查询全部主题
    List<Topic> fetchByUserId(int userId,int rows);//根据用户id查找主题
}
