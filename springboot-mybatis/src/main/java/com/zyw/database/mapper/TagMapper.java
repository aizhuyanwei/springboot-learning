package com.zyw.database.mapper;

import com.zyw.database.dto.TagDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TagMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(TagDto record);

    int insertSelective(TagDto record);

    TagDto selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TagDto record);

    int updateByPrimaryKey(TagDto record);
}