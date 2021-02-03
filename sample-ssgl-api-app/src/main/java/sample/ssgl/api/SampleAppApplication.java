package sample.ssgl.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author walles
 */
@SpringBootApplication
@ServletComponentScan
@Profile("default")
public class SampleAppApplication implements ApplicationRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleAppApplication.class);

    @Autowired
    private AppName appName;

    public static void main(String[] args) {
        SpringApplication.run(SampleAppApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.info("Application name: {}", appName.name());
    }

    @Bean
    public AppName getAppName(@Value("${app.name}") String appName) {
        return () -> appName;
    }

}
