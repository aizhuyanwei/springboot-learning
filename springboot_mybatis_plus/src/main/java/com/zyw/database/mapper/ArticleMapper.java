package com.zyw.database.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyw.database.dto.ArticleDto;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章实体类
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年04月15日  15:36 by zyw9527
 */
@Mapper
public interface ArticleMapper extends BaseMapper<ArticleDto> {

    ArticleDto selectByPrimaryKey(Integer id);


}
