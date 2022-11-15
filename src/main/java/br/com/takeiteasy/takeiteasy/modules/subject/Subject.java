package br.com.takeiteasy.takeiteasy.modules.subject;

import java.util.concurrent.atomic.AtomicInteger;

public class Subject {
    private static AtomicInteger count = new AtomicInteger(0);
    private int subjectID;
    private String name;

    public Subject(String name) {
        this.name = name;
        this.subjectID = count.incrementAndGet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getSubjectID() {
        return subjectID;
    }
}
