package rainclassv2.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("rainclassv2")
@MapperScan("rainclassv2.mapper") //mybatis mapper接口扫描
public class RainClassV2Application {

    public static void main(String[] args) {
        SpringApplication.run(RainClassV2Application.class, args);
    }

}
