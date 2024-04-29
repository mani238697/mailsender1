package com.mail.mailsender.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MailStructure {
    private String subject="link";
    private String message="<html><body><p>Click <a href=\\\"https://www.javatpoint.com/java-tutorial\\\">here</a> to visit JavaTpoint</p></body></html>";

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
