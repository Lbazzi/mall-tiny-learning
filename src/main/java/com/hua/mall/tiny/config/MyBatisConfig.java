package com.hua.mall.tiny.config;

import com.alibaba.druid.support.json.JSONUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan("com.hua.mall.tiny.mbg.mapper")
public class MyBatisConfig {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

