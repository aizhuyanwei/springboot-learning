package com.zyw;

import com.zyw.database.dto.TagDto;
import com.zyw.database.mapper.TagMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 标签测试类
 *
 * @author: zyw9527
 * @version: v1.0  Created in 2019年04月15日  15:06 by zyw9527
 */
@SpringBootTest(classes = SpringbootMybatisApplication.class)
@RunWith(SpringRunner.class)
public class TagMapperTest {

    @Autowired
    TagMapper tagMapper;

    @Test
    public void testSelect(){
        TagDto tagDto = tagMapper.selectByPrimaryKey(5);

        System.out.println(tagDto.getName());
    }



}
