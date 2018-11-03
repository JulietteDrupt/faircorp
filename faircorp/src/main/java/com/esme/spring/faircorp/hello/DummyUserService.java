package com.esme.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class DummyUserService implements UserService {
    @Autowired
    public GreetingService greetingService;
    @Override
    public void greetAll() {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Elodie");
        liste.add("Charles");
        for (int i=0;i<liste.size();i++) {
            this.greetingService.greet(liste.get(i));
        }
    }

}
