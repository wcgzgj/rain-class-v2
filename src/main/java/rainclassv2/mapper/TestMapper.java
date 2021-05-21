package rainclassv2.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import rainclassv2.pojo.Test;

import java.util.List;

@Repository
@Mapper
public interface TestMapper {
    List<Test> getList();
}
