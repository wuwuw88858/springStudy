package com.example.demo.packageScan.config;

import com.example.demo.packageScan.vo.Bar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Bar.class)
public class BarConfiguration {
}
