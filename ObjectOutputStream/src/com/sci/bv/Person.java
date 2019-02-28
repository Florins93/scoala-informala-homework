package com.sci.bv;

import java.io.Serializable;

public class Person implements Serializable {
    String firstName;
    String lastName;
    transient Thread myThread;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Thread getMyThread() {
        return myThread;
    }

    public void setMyThread(Thread myThread) {
        this.myThread = myThread;
    }



    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myThread=myThread;

    }
}
