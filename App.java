import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {
        // Criando um timer
        Timer timer = new Timer();

        // Criando uma tarefa que será executada periodicamente
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Está na hora de trabalhar!");
            }
        };

        // Agendando a tarefa para rodar a cada 5 minutos (300.000 milissegundos)
        timer.scheduleAtFixedRate(tarefa, 0, 10000);
    }
}

    

