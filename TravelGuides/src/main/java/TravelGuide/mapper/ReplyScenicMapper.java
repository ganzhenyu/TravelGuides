package TravelGuide.mapper;

import TravelGuide.entity.ReplyScenic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/6/11.
 */
public interface ReplyScenicMapper {
    List<ReplyScenic> fetchByScenicId(int scenicId);//根据景点id查询景点评价
    void add(@Param("scenicId") int scenicId, ReplyScenic replyScenic);//评价景点
}
