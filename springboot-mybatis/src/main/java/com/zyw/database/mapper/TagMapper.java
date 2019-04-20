package com.zyw.database.mapper;

import com.zyw.database.dto.TagDto;
import org.apache.ibatis.annotations.Mapper;

/**
 * 标签
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年04月19日  12:27 by zyw9527
 */
@Mapper
public interface TagMapper {

    TagDto selectByPrimaryKey(Integer id);
}
