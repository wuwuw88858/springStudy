package com.example.demo.ClassResource;

import org.springframework.core.io.ProtocolResolver;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class DogProtocolResolver implements ProtocolResolver {

    public static final String SUB_INDEX = "a:";
    @Override
    public Resource resolve(String location, ResourceLoader resourceLoader) {

        if (!location.startsWith(SUB_INDEX) || null == location) {
            return null;
        }

        // 把自定义前缀去掉
        String realpath = location.substring(SUB_INDEX.length());
        String classpathLocation = "classpath:resource/" + realpath;
        return resourceLoader.getResource(classpathLocation);
    }
}
