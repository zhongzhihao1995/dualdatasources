package dualdatasources;

import dualdatasources.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tony
 * @date 2021/1/5 15:55
 */
@SpringBootApplication
@MapperScan(basePackages = "dualdatasources.db.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
@RestController
@EnableRetry
@Slf4j
public class Application {

    @Resource
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String index(){
        return "多数据源验证服务";
    }

    @RequestMapping(value = "/test")
    public void test(){
        testService.method1();
    }
}
