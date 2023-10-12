package org.onesingletopic.interview.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InterviewBean {

    @Value("${interview.bean.value}")
    private String name;

    public Integer identity(int i) {

        System.out.println(name + " is returning " + i );
        return i;

    }
}
