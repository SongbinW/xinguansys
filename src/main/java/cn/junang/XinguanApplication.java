package cn.junang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan({"cn.junang.*.mapper","cn.junang.*.dao"})
public class XinguanApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinguanApplication.class, args);
    }

}
