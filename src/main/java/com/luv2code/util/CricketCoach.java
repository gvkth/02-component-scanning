package com.luv2code.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice fast blowling for 15 minutes!!!123";
    }
}
