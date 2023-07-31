package com.github.joekerouac.mybatis.plus.demo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author JoeKerouac
 * @date 2023-07-29 17:54
 * @since 1.0.0
 */
@Data
@TableName("user")
public class UserEntity {

    private Long id;

    private String name;

}
