package com.gokhanul.classes;

public class Coupling {

    // Coupling means one class depends directly on another class.
    // If one changes, the other usually must change too.
    // Hard to extend, scale, or reuse.
    // Tight coupling means depend heavily on each other. One change forces changes in
    // multiple places, flexibility and increasing maintenance effort.
}
// Example:
class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class Notification {
    private EmailService emailService = new EmailService(); // tightly coupled

    public void notifyUser(String msg) {
        emailService.sendEmail(msg);
    }

    //-----------------------------------------------------------------------------------------

}

    // LOOSE COUPLING (REDUCED COUPLING)
    // Classes communicate through interfaces or abstraction, not concrete classes.
    // Easy to replace components without breaking code.
    // Flexible, scalable, testable.
    // Best practice in frameworks, design patterns & automation.

    // Example:
interface MessageService {
    void send(String msg);
}

class EmailServices implements MessageService {
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

class SMSService implements MessageService {
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}

class Notifications {
    private MessageService messageService;

    // CONSTRUCTOR
    public Notifications(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUsers(String msg) {
        messageService.send(msg);
    }
}