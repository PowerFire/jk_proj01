package com.rody.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter, leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public long getDuraion(){
        Duration duration= Duration.between(enter,leave);

        return duration.toMinutes();
    }
    public void leave() {
       // this.leave=System.currentTimeMillis();
        this.leave=LocalDateTime.now();
    }

    public void setLeave(LocalDateTime leave) {
        if (leave.isAfter( enter)) {
        //if (leave> enter) {
            this.leave = leave;
        }
    }
}
