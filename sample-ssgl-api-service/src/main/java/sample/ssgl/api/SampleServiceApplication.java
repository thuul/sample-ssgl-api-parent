package sample.ssgl.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sample.ssgl.api.crud.dao.AppSettingRepository;
import sample.ssgl.api.crud.entity.AppSetting;

@SpringBootApplication
@EnableJpaRepositories(value = {"sample.ssgl.api"})
@EntityScan(value = {"sample.ssgl.api"})
@ServletComponentScan
public class SampleServiceApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SampleServiceApplication.class, args);
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(SampleServiceApplication.class);

    @Autowired
    private AppSettingRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        repository.save(new AppSetting("app.name", "SSGL Sample Application", true));
        repository.findAll().iterator().forEachRemaining((e) -> {
            LOGGER.info(e.getSetValue());
        });
    }

}
