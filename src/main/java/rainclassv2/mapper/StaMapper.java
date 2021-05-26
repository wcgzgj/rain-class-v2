package rainclassv2.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import rainclassv2.pojo.Sta;
import rainclassv2.pojo.StaExample;

public interface StaMapper {
    long countByExample(StaExample example);

    int deleteByExample(StaExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Sta record);

    int insertSelective(Sta record);

    List<Sta> selectByExample(StaExample example);

    Sta selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Sta record, @Param("example") StaExample example);

    int updateByExample(@Param("record") Sta record, @Param("example") StaExample example);

    int updateByPrimaryKeySelective(Sta record);

    int updateByPrimaryKey(Sta record);
}