import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * AdminApplication
 *
 * @author njy
 * @version 1.0
 * @description 启动类
 * @date 2023/8/16 16:34
 * @say 山河总静好，人事也从容
 */
@SpringBootApplication(scanBasePackages = {"com.heima"})
@EnableDiscoveryClient
@MapperScan("com.heima.article.mapper")
public class ArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class,args);
    }
    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}