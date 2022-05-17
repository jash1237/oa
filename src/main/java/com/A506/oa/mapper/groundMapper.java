package com.A506.oa.mapper;


import com.A506.oa.common.Result;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author 凉风
 * @create 2022-05-15 16:04
 */
@Transactional
@Service
public interface groundMapper {
    @Select("select * from v_cmt_qsba where year=#{year} and object=#{object}")
    public List<Result> searchGrand(String year, String object);
}
