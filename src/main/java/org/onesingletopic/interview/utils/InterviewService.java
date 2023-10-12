package org.onesingletopic.interview.utils;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterviewService {

    private static InterviewBean service;

    public InterviewService(InterviewBean service){
        InterviewService.service = service;
    }

    public List<Integer> dummy_function(int call_number) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i =0; i< call_number; i++) {
            result.add(service.identity(i));
        }
        return result;
    }
}
