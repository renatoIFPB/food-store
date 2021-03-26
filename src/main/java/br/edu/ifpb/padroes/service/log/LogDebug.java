package br.edu.ifpb.padroes.service.log;

public class LogDebug {
    //Bridge
    public LogHandler(LogHandlerType type) {
        this.type = type;
    }
    
    private LogHandler logHandler;

    public void debug(String message) {
        logHandler.log("stack trace");
        logHandler.log(message);
    }

}
