package edu.ucaldas.structural;

public class SMSNotifier extends NotifierDecorator {

    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return "SMS enviado: " + message + " | " + notifier.send(message);
    }
}
