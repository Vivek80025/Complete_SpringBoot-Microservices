package com.vivek.SpringBootP03.beans;

import org.springframework.stereotype.Component;

@Component
public interface Partners {
    public void payment(String amount);
}
