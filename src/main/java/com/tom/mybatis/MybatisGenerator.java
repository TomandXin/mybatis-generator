package com.tom.mybatis;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @author bleedfly.
 */
public class MybatisGenerator {

    private static final String PROPERTIES_FILE = "mybatis-generator.properties";

    public void generator() throws Exception {
        // 加载mybatis-generator配置文件
        Properties propertyMap = new Properties();
        propertyMap.load(ClassLoader.getSystemResourceAsStream(PROPERTIES_FILE));
        // 初始化常量信息
        new MyBatisGenConst(propertyMap);
        // 获取表名
        String tableName = propertyMap.getProperty("tables");
        if (StringUtils.isEmpty(tableName)) {
            System.out.println("tables is not allow empty");
            return;
        }
        List<String> tables = Arrays.asList(tableName.split(","));

        MyBatisGenCore myBatisGenCore = new MyBatisGenCore();
        myBatisGenCore.batchGen(tables, propertyMap);
        System.out.print("all done");
    }
}