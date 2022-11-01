package com.olakunle.sonarqubeone.serviceimpl;

import org.springframework.stereotype.Service;


@Service
public class MessageServiceImpl {


    public String getMessage () {
        String str = "This is a SonarQube experiment";
        Object obj = getObject();
        System.out.println(obj.toString());
        return str;
    }

    private Object getObject () {
        return null;
    }
}
