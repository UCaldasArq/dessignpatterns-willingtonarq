package edu.ucaldas.behavior;

// TODO: Implementa el patrón Chain of Responsibility.
// Crea tres manejadores concretos:
// 1. BasicSupportHandler → maneja solicitudes "básicas"
// 2. SupervisorHandler → maneja solicitudes "intermedias"
// 3. ManagerHandler → maneja solicitudes "avanzadas"
// Si no puede manejar, debe pasar al siguiente en la cadena.

public class SupportHandler {
    public static Handler createChain() {
        BasicSupportHandler basicSupportHandler = new BasicSupportHandler();
        SupervisorHandler supervisorHandler = new SupervisorHandler();
        ManagerHandler managerHandler = new ManagerHandler();
        supervisorHandler.setNext(managerHandler);
        basicSupportHandler.setNext(supervisorHandler);
        return basicSupportHandler;
    }
}
