package cn.leolam10.gmall.cms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.配置整合dubbo
 * 2.配置整合MybatisPlus
 */
@EnableDubbo
@MapperScan(basePackages = "cn.leolam10.gmall.cms.mapper")
@SpringBootApplication
public class GmallCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCmsApplication.class, args);
    }

}
