package be.waitinglist.common;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.PropertyAccessor.ALL;
import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;

@Configuration
@ComponentScan
class CommonConfig {

    @Bean
    public UncheckedObjectMapper objectMapper() {
        UncheckedObjectMapper mapper = new UncheckedObjectMapper();
        mapper.setVisibility(ALL, NONE);
        mapper.setVisibility(FIELD, ANY);
        return mapper;
    }

}