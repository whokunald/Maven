package com.crossasyst.pojo;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Demo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("Kunal");
        p.setLastName("Console log trial");
        log.info(p.getFirstName() + p.getLastName());
    }
}
