package net.zerotoweb.api;


/**
 * packageName: net.zerotoweb.api
 * fileName   : CorsConfig
 * author     : kimhanseul
 * date       : 2022-02-24
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-24  kimhanseul 최초 생성
 */
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {

        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/**")
                        .allowedMethods(CorsConfiguration.ALL)
                        .allowedHeaders(CorsConfiguration.ALL)
                        .allowedOriginPatterns(CorsConfiguration.ALL);
            }
        };
    }
}