package br.edu.ifpb.padroes.service.log;

public class LogInfo {
    //Bridge
    public LogHandler(LogHandlerType type) {
        this.type = type;
    }
    
    private LogHandler logHandler;

    public void info(String message) {
        logHandler.log(message);
    }
}
