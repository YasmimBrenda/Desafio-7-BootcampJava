public class Main {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getInstance();
        
        logManager.log("Aplicação iniciada.");
        logManager.log("Executando algumas tarefas...");
        logManager.log("Aplicação finalizada.");
        
        logManager.close();
    }
}