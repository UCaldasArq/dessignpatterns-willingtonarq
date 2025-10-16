package edu.ucaldas.structural;

// TODO: Implementa el patrón Decorator.
// 1. Crea una clase abstracta NotifierDecorator que implemente Notifier.
// 2. Debe tener un campo protegido Notifier wrappee y delegar la llamada a send().

public abstract class NotifierDecorator implements Notifier {
    // TODO: agrega el atributo y constructor.

    Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String send(String message) {
        return notifier.send(message);
    }
}

// TODO: Crea la clase SMSNotifier que extienda NotifierDecorator
// Debe agregar el comportamiento adicional:
// "SMS enviado: " + message + " | " + resultado_del_email
