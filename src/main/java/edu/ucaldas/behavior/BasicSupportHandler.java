package edu.ucaldas.behavior;

public class BasicSupportHandler extends Handler{

    @Override
    public String handleRequest(String request) {
        if(request.contains("básica")){
            return "Atendido por Soporte Básico";
        }
        return this.next.handleRequest(request);
    }


}
