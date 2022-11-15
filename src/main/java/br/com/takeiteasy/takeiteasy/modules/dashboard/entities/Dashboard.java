package br.com.takeiteasy.takeiteasy.modules.dashboard.entities;

import java.util.List;

import br.com.takeiteasy.takeiteasy.modules.activity.Activity;
import br.com.takeiteasy.takeiteasy.modules.student.entities.Student;

public class Dashboard {
    private Student student;
    private List<Activity> activities;

    public Dashboard(Student student) {
        this.student = student;
    }

    public Dashboard(Student student, List<Activity> activities) {
        this.student = student;
        this.activities = activities;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
