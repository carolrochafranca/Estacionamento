import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Veiculo {

    String tipo, placa;
    int horaEntrada;

    public void entrarEstacionamento() {
        showMessageDialog(null, "Bem-vindo ao estacionamento!");
        tipo = showInputDialog("Carro ou moto");
        while (!tipo.equalsIgnoreCase("carro") && !tipo.equalsIgnoreCase("moto")) {
            tipo = showInputDialog("Opção inválida! Digite apenas carro ou moto");
        }
        placa = showInputDialog("Qual a placa do veiculo?");
        horaEntrada = parseInt(showInputDialog("Que horas você chegou?"));
    }

    public void sairEstacionamento() {
        int horaSaida = parseInt(showInputDialog("Que horas você saiu?"));
        while (horaSaida < horaEntrada) {
            horaSaida = parseInt(showInputDialog("Horario inválido! O horario tem que ser maior que " + horaEntrada));
        }
        double valorBase;
        double horaCalculada;
        //Carro 10 (2 reais por hora)
        //Moto 5 (2 reais por hora)
        if(tipo.equalsIgnoreCase("carro")) {
            valorBase = 10;
        } else {
            valorBase = 5;
        }
        horaCalculada = horaSaida - horaEntrada;
        valorBase = valorBase + (horaCalculada - 1) * 2;

        int horas = (int)horaCalculada;
        int minutos = (int)(horaCalculada / 60);

        showMessageDialog(null, "Você ficou " + horas + "h" + minutos + "m" + "\nTotal à pagar: " + "R$" + valorBase);
    }


}