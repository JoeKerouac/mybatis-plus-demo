package com.github.joekerouac.mybatis.plus.demo;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author JoeKerouac
 * @date 2023-07-29 17:57
 * @since 1.0.0
 */
@RestController
public class TestService {

    @Resource
    private UserRepository userRepository;

    @Transactional
    public List<IPage<UserEntity>> test1() {
        return test2();
    }

    public List<IPage<UserEntity>> test2() {
        IPage<UserEntity> page1 = userRepository.selectPage(1, 1);
        IPage<UserEntity> page2 = userRepository.selectPage(2, 1);
        return Arrays.asList(page1, page2);
    }

}
