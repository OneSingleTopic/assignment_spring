package org.onesingletopic.interview;


import org.onesingletopic.interview.utils.InterviewService;
import org.onesingletopic.interview.utils.InterviewBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:application.properties")
public class AppConfig {
    @Bean
    public InterviewBean interviewService(){
        return new InterviewBean();
    }
    @Bean
    public InterviewService interviewFunctions(){
        return new InterviewService(interviewService());
    }
}
