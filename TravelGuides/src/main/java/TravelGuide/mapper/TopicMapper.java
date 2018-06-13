package TravelGuide.mapper;

import TravelGuide.entity.Topic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/6/10.
 */
public interface TopicMapper {
    List<Topic> getAll(@Param("rows")int rows);//查询全部主题
    List<Topic> fetchByUserId(@Param("userId")int userId, @Param("rows")int rows);//根据用户id查找主题
}
