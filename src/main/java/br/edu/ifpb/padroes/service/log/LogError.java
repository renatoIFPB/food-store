package br.edu.ifpb.padroes.service.log;

public class LogError {
    //Bridge
    public LogHandler(LogHandlerType type) {
        this.type = type;
    }
    
    private LogHandler logHandler;

    public void error(String message) {
        logHandler.log("error");
        logHandler.log(message);
    }
}
