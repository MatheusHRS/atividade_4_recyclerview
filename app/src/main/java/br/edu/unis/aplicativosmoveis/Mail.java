package br.edu.unis.aplicativosmoveis;

public class Mail {

    private String name;
    private String subject;
    private String message;
    private int backgroundColor;

    public Mail(String name, String subject, String message, int backgroundColor) {
        this.name = name;
        this.subject = subject;
        this.message = message;
        this.backgroundColor = backgroundColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsubject() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
