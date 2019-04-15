package com.zyw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class SpringbootMybatisApplicationTests {



   /* @Test
    public void insert() {
        TagDto dto = new TagDto();
        dto.setName("测试01");
        tagMapper.insert(dto);

    }*/

    @Test
    public void sayHello () {
        System.out.println("Hello");
    }


}
