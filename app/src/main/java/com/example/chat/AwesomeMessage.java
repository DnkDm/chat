package com.example.chat;

public class AwesomeMessage {
    String text;
    String name;
    String inageUrl;

    public AwesomeMessage(){
    }

    public AwesomeMessage(String text, String name, String inageUrl) {
        this.text = text;
        this.name = name;
        this.inageUrl = inageUrl;
    }

    public String getText() {
        return text;
    }

    public String getName() {
        return name;
    }

    public String getInageUrl() {
        return inageUrl;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInageUrl(String inageUrl) {
        this.inageUrl = inageUrl;
    }
}
