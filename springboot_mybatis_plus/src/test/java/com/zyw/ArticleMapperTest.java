package com.zyw;

import com.zyw.database.dto.ArticleDto;
import com.zyw.database.mapper.ArticleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 文章测试类
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年04月15日  15:41 by zyw9527
 */
@SpringBootTest(classes = SpringbootMybatisPlusApplication.class)
@RunWith(SpringRunner.class)
public class ArticleMapperTest {


    @Autowired
    ArticleMapper articleMapper;


    /**
     * 自定义sql测试
     */
    @Test
    public void testSelectByPrimaryKey() {
        ArticleDto dto = articleMapper.selectByPrimaryKey(1);
        System.out.println(dto);
    }

    /**
     * 框架集成的crud方法测试
     */
    @Test
    public void testInsert() {

        ArticleDto articleDto = new ArticleDto();
        articleDto.setMdMaterial("文章测试");
        int num = articleMapper.insert(articleDto);
        System.out.println(num);
    }

    /**
     * 框架集成的crud方法测试  根据主键删除
     */
    @Test
    public void testDeletet() {
        ArticleDto articleDto = new ArticleDto();
        articleDto.setArticleCode("d201822d9927c3ae978be78bb5c1ddc3");
        articleMapper.deleteById(articleDto);
    }

}
