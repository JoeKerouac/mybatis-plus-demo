package com.github.joekerouac.mybatis.plus.demo;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * @author JoeKerouac
 * @date 2023-07-29 17:55
 * @since 1.0.0
 */
@Mapper
public interface UserRepository extends BaseMapper<UserEntity> {

    default IPage<UserEntity> selectPage(int pageNo, int size) {
        return selectPage(new Page<>(pageNo, size), null);
    }

}
