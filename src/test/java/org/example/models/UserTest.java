package org.example.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void compilation(){
       User newUser = new User(12458,"aqws1243" );
       newUser.setNick("Juanito");
       String passwordChange = newUser.setPassword("aqws143","ac12345");
       Assertions.assertEquals(passwordChange,"Wrong");
       newUser.lastChange = new Date();

       System.out.println(newUser);
       Assertions.assertEquals(newUser.getNick(), "Juanito");
       Assertions.assertEquals(newUser.getId(),12458);

    }
}