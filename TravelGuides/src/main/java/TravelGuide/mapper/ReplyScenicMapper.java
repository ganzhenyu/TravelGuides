package TravelGuide.mapper;

import TravelGuide.entity.ReplyScenic;

import java.util.List;

/**
 * Created by Administrator on 2018/6/11.
 */
public interface ReplyScenicMapper {
    List<ReplyScenic> fetchByScenicId(int scenicId);
    void add(ReplyScenic replyScenic);//评价景点
}
