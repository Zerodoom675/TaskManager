package ru.netology;

public class Meeting extends Task {

    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id); // вызов родительского конструктора
        this.topic = topic; // заполнение своих полей
        this.project = project; // заполнение своих полей
        this.start = start; // заполнение своих полей
    }

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        return project.contains(query);
    }
}