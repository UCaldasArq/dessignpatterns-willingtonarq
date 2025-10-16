package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler{
    @Override
    public String handleRequest(String request) {
        if(request.contains("intermedia")){
            return "Atendido por Supervisor";
        }
        return this.next.handleRequest(request);
    }
}
