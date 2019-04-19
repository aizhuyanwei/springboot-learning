package com.zyw;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyw.database.dto.ArticleDto;
import com.zyw.database.mapper.ArticleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 文章测试类
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年04月15日  15:41 by zyw9527
 */
@SpringBootTest(classes = SpringbootMybatisApplication.class)
@RunWith(SpringRunner.class)
public class ArticleMapperTest {


    @Autowired
    ArticleMapper articleMapper;

    @Test
    public void testInsert() {
        ArticleDto articleDto = new ArticleDto();
        articleDto.setMdMaterial("文章测试");
        articleMapper.insert(articleDto);
    }

    @Test
    public void testSelect() {
        List<ArticleDto> articleDtos = articleMapper.selectList(new QueryWrapper<>());
        System.out.println(articleDtos.size());
    }

    @Test
    public void testSelectOne() {
        ArticleDto articleDto = articleMapper.selectByPrimaryKey(1);
        System.out.println(articleDto);
    }

}
