package TravelGuide.mapper;

import TravelGuide.entity.ReplyScenic;
import TravelGuide.entity.Scenic;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/6/10.
 */
public interface ScenicMapper {
    List<Scenic> fetchByEndTime(@Param("rows")int rows);//最新更新的景点
    List<Scenic> fetchByLove(@Param("rows")int rows);//最多喜欢的景点
    List<Scenic> fetchByEvaluate(@Param("rows")int rows);//最多好评的景点
    List<Scenic> fetchByCityId(@Param("cityId")int cityId);//根据城市id查找景点
    List<Scenic> fetchByCollect(@Param("userId")int userId,@Param("rows")int rows);//该用户收藏的景点
    Scenic fetchById(int id);//根据景点id查询景点详细
}
