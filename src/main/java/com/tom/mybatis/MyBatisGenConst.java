package com.tom.mybatis;

import java.io.File;
import java.util.Properties;

/**
 * mybatisgen generate constants.
 *
 * @author xizhe.
 */
public class MyBatisGenConst {

    public MyBatisGenConst(Properties properties) {
        initConst(properties);
    }

    // 工作目录
    public static final String WORK_DIR = System.getProperty("user.dir") + File.separator;

    public static String TABLE_PREFIX;
    // 包名
    public static String MAIN_PACKAGE;
    public static String DO_PACKAGE;
    public static String QUERY_PACKAGE;
    public static String MAPPER_PACKAGE;
    public static String MANAGER_PACKAGE;
    public static String MANAGER_IMPL_PACKAGE;
    public static String MAPPER_EXT_PACKAGE;

    // base dir
    public static String BASE_DIR;
    // mapper xml 输出目录
    public static String MAPPER_XML_DIR;
    // mapper-ext xml 输出目录
    public static String MAPPER_EXT_XML_DIR;
    // do/model 输出目录
    public static String MAPPER_DO_DIR;
    // query 输出目录
    public static String MAPPER_QUERY_DIR;
    // mapper java 输出目录
    public static String MAPPER_JAVA_DIR;

    public static String MANAGER_JAVA_DIR;
    public static String MANAGER_IMPL_JAVA_DIR;

    // mapper-ext java 输出目录
    public static String MAPPER_EXT_JAVA_DIR;

    public static final String QUERY_PREFIX = "Query";
    public static final String MAPPER_SUFFIX = "Mapper";
    public static final String MANAGER_SUFFIX = "Manager";
    public static final String MANAGER_IMPL_SUFFIX = "ManagerImpl";
    public static final String MAPPER_EXT_SUFFIX = "ExtMapper";
    public static final String DO_SUFFIX = "DO";

    // java数据对象类模板
    public static final String DO_TEMPLATE = "/template/do.txt";
    // query 模板
    public static final String QUERY_TEMPLATE = "/template/query.txt";
    // sqlmap模板
    public static final String SQLMAP_TEMPLATE = "/template/sqlmap.txt";
    // mapper模板
    public static final String MAPPER_TEMPLATE = "/template/mapper.txt";
    // manager模板
    public static final String MANAGER_TEMPLATE = "/template/manager.txt";
    // manager impl 模板
    public static final String MANAGER_IMPL_TEMPLATE = "/template/managerImpl.txt";
    // mapper-ext模板
    public static final String MAPPER_EXT_TEMPLATE = "/template/mapper-ext.txt";
    // sqlmap-ext模板
    public static final String SQLMAP_EXT_TEMPLATE = "/template/sqlmap-ext.txt";

    public static final String PAGE_RESULT_TEMPLATE = "/template/page-result.txt";

    public static final String BASE_QUERY_TEMPLATE = "/template/base-query.txt";

    public static final String BASE_CRITERIA_TEMPLATE = "/template/base-criteria.txt";

    public static final String COMMON_COLUMN_STR = "gmt_create,gmt_modified,";

    // jdbc result set metadata collumn name
    public static final String RSMD_COLUMN_NAME = "rsmdColumnName";
    public static final String RSMD_COLUMN_CLASS_NAME = "columnClassName";
    public static final String RSMD_COLUMN_TYPE_NAME = "columnTypeName";
    public static final String RSMD_COLUMN_PRECISION = "Precision";
    public static final String RSMD_COLUMN_SCALE = "Scale";
    public static final String RSMD_COLUMN_PRIMARY_KEY = "PrimaryKey";
    public static final String RSMD_COLUMN_REMARKS = "Remarks";

    public static final String COLUMN_NAME = "COLUMN_NAME";

    // velocity param
    public static final String VP_LIST = "list";
    public static final String VP_QUERY_PREFIX = "queryPrefix";
    public static final String VP_DO_SUFFIX = "doSuffix";
    public static final String VP_MAPPER_SUFFIX = "mapperSuffix";
    public static final String VP_MANAGER_SUFFIX = "managerSuffix";

    public static final String VP_MANAGER_IMPL_SUFFIX = "managerImplSuffix";
    public static final String VP_MAPPER_EXT_SUFFIX = "extMapperSuffix";
    public static final String VP_CLASS_NAME = "className";
    public static final String VP_MAPPER_PROPERTY_NAME = "mapperPropertyName";
    public static final String VP_MAIN_PACKAGE = "mainPackage";
    public static final String VP_DO_PACKAGE = "doPackage";
    public static final String VP_QUERY_PACKAGE = "queryPackage";
    public static final String VP_MAPPER_PACKAGE = "mapperPackage";
    public static final String VP_MANAGER_PACKAGE = "managerPackage";
    public static final String VP_MANAGER_IMPL_PACKAGE = "managerImplPackage";
    public static final String VP_MAPPER_EXT_PACKAGE = "mapperExtPackage";
    public static final String VP_JAVA_TYPE = "javaType";
    public static final String VP_PROP_NAME = "propName";
    public static final String VP_GET_METHOD = "getMethod";
    public static final String BASE_CRITERIA = "baseCriteriaClass";
    public static final String BASE_QUERY = "baseQueryClass";
    public static final String PAGE_RESULT = "pageResultClass";

    public static final String VP_SET_METHOD = "setMethod";
    public static final String VP_COLUMN_NAME = "columnName";
    public static final String VP_COLUMN_REMARKS = "columnRemarks";
    public static final String VP_TABLE_NAME = "tableName";
    public static final String VP_JDBC_TYPE = "jdbcType";
    public static final String VP_COLS = "cols";
    public static final String VP_COLS_WITHOUT_COMMON_COLUMNS = "colsWithoutCommColumns";
    public static final String VP_SERIAL_VERSION_UID = "serialVersionUID";

    public static final String VP_SERIAL_VERSION_UID2 = "serialVersionUID2";
    public static final String VP_PRIMARY_KEY = "primaryKey";
    public static final String VP_PROP_PRIMARY_KEY = "propPrimaryKey";

    //分库分表 表后缀regex
    public static final String SHARDING_SUFFIX_REG = "_[\\d]{4}";

    /**
     * 初始化常量信息
     */
    public void initConst(Properties properties) {
        MAIN_PACKAGE = (String)properties.get("main_package");
        DO_PACKAGE = (String)properties.get("do_package");
        QUERY_PACKAGE = (String)properties.get("query_package");
        MAPPER_PACKAGE = (String)properties.get("mapper_package");
        MAPPER_EXT_PACKAGE = (String)properties.get("mapper_ext_package");
        MANAGER_PACKAGE = (String)properties.get("manager_package");
        MANAGER_IMPL_PACKAGE = (String)properties.get("manager_impl_package");

        // xml dir
        MAPPER_XML_DIR = WORK_DIR + String.valueOf(properties.get("mapper_xml_dir"));
        MAPPER_EXT_XML_DIR = WORK_DIR + String.valueOf(properties.get("mapper_ext_xml_dir"));
        MAPPER_DO_DIR = WORK_DIR + String.valueOf(properties.get("mapper_do_dir"));
        MAPPER_QUERY_DIR = WORK_DIR + String.valueOf(properties.get("mapper_query_dir"));
        MAPPER_JAVA_DIR = WORK_DIR + String.valueOf(properties.get("mapper_java_dir"));
        MANAGER_JAVA_DIR = WORK_DIR + String.valueOf(properties.get("manager_java_dir"));
        MANAGER_IMPL_JAVA_DIR = WORK_DIR + String.valueOf(properties.get("manager_impl_java_dir"));
        MAPPER_EXT_JAVA_DIR = WORK_DIR + String.valueOf(properties.get("mapper_ext_java_dir"));
        BASE_DIR = WORK_DIR + String.valueOf(properties.get("base_dir"));

        TABLE_PREFIX = (String)properties.get("table_prefix");
    }

}
