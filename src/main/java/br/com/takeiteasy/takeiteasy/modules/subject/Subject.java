package br.com.takeiteasy.takeiteasy.modules.subject;

public class Subject {
    private int subjectID;
    private String name;

    public Subject(String name) {
        this.name = name;
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
