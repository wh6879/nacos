package com.nacos;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Arrays;
import java.util.Properties;

public class Main {



    public static void main(String[] args) throws NacosException {
        String host = "127.0.0.1:8848";
        String dataId = "test";
        String group = "test";

        Properties prop = new Properties();
        prop.put("serverAddr", host);
        ConfigService configService = NacosFactory.createConfigService(prop);

        String config = configService.getConfig(dataId, group, 5000);
        System.out.println(config);

    }
}
