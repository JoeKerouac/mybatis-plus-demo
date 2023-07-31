package com.github.joekerouac.mybatis.plus.demo;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author JoeKerouac
 * @date 2023-07-29 18:01
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTest {

    @Resource
    private TestService testService;

    @Test
    public void test1() {
        // 开启了事务，这里查出来的结果是一样的
        List<IPage<UserEntity>> list = testService.test1();
        List<UserEntity> entities1 = list.get(0).getRecords();
        List<UserEntity> entities2 = list.get(1).getRecords();

        Assert.assertEquals(entities1.size(), entities2.size());
        Assert.assertEquals(entities1.get(0), entities2.get(0));
    }

    @Test
    public void test2() {
        // 未开启了事务，这里查出来的结果是不一样的
        List<IPage<UserEntity>> list = testService.test2();
        List<UserEntity> entities1 = list.get(0).getRecords();
        List<UserEntity> entities2 = list.get(1).getRecords();

        Assert.assertEquals(entities1.size(), entities2.size());
        Assert.assertNotEquals(entities1.get(0), entities2.get(0));
    }

}
