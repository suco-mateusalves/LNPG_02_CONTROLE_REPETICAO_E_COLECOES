import java.io.*;
import java.util.*;

public class aeroporto_lista_de_checagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;  // Número de passageiros
        N = scanner.nextInt();  // Leitura do número de passageiros

        // Laço para cada passageiro
        for (int i = 0; i < N; i++) {
            String possuiRG, dataNascimentoRG;  // Informações do RG do passageiro
            String possuiPassagem, dataNascimentoPassagem, assento;  // Informações da passagem

            // Leitura das informações do passageiro
            possuiRG = scanner.next(); // Leitura da informação sobre possuir RG
            // Gambiarra
            if (possuiRG.equals("Nao")) { 
                String segundaPalavra = scanner.next();
                possuiRG = possuiRG + " " + segundaPalavra;
            }
            // System.out.printf("flag: %s\n", possuiRG); 
            dataNascimentoRG = scanner.next();  // Leitura da data de nascimento do RG
            possuiPassagem = scanner.next();  // Leitura da informação sobre possuir passagem
            // digo, Aparato Técnico
            if (possuiPassagem.equals("Nao")) { 
                String segundaPalavra = scanner.next();
                possuiPassagem = possuiPassagem + " " + segundaPalavra;
            }
            // System.out.printf("flag: %s\n", possuiPassagem); 
            dataNascimentoPassagem = scanner.next();  // Leitura da data de nascimento da passagem
            assento = scanner.next();  // Leitura do número do assento

            // Verificação das condições
            if (possuiRG.equals("Nao possui")) {
                System.out.println("a saida e nessa direção");  // Se não possui RG
            } else if (possuiPassagem.equals("Nao possui")) {
                System.out.println("a recepição e nessa direção");  // Se não possui passagem
            } else if (!dataNascimentoRG.equals(dataNascimentoPassagem)) {
                System.out.println("190");  // Se as datas de nascimento do RG e da passagem são diferentes
            } else {
                System.out.printf("o seu assento e %s tenha um bom dia\n", assento);  // Se todas as condições são atendidas
            }
        }
    }
}
