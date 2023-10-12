package org.onesingletopic.interview.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Arrays;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class InterviewServiceTest {

    @Mock
    InterviewBean mockService;

    @InjectMocks
    InterviewService interviewService;

    @Test
    public void testInit(){
        when(mockService.identity(anyInt())).thenReturn(2,1,0);
        List<Integer> result = interviewService.dummy_function(5);
        Assertions.assertEquals(result, Arrays.asList(2,1,0,0,0), "This function should return the 10 first integers");
    }
}