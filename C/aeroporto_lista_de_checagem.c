#include <stdio.h>
#include <string.h>

int main() {
    int N;  // Número de passageiros
    scanf("%d", &N);  // Leitura do número de passageiros

    // Laço para cada passageiro
    for (int i = 0; i < N; i++) {
        char possuiRG[11], dataNascimentoRG[11];  // Informações do RG do passageiro
        char possuiPassagem[11], dataNascimentoPassagem[11], assento[4];  // Informações da passagem

        // Leitura das informações do passageiro
        // Tive que usar " %10[^\n]" pois tive problemas ao ler 'Nao possui' por conta do espaço, que jogava o 'possui' para a string seguinte
        // O espaço antes do % consume as quebras de linha pendentes da entrada anterior
        // '10' eh é o número máximo de char a serem lidos
        // [^\n] indica que o scanf deve continuar até encontrar uma quebra de linha
        scanf(" %10[^\n]", possuiRG);  // Leitura da informação sobre possuir RG
        scanf("%s", dataNascimentoRG);  // Leitura da data de nascimento do RG
        scanf(" %10[^\n]", possuiPassagem);  // Leitura da informação sobre possuir passagem
        scanf("%s", dataNascimentoPassagem);  // Leitura da data de nascimento da passagem
        scanf("%s", assento);  // Leitura do número do assento

        // Verificação das condições
        if (possuiRG[0] == 'N') {
            printf("a saida e nessa direção\n");  // Se não possui RG
        } else if (possuiPassagem[0] == 'N') {
            printf("a recepição e nessa direção\n");  // Se não possui passagem
        } else if (strcmp(dataNascimentoRG, dataNascimentoPassagem) != 0) {
            printf("190\n");  // Se as datas de nascimento do RG e da passagem são diferentes
        } else {
            printf("o seu assento e %s tenha um bom dia\n", assento);  // Se todas as condições são atendidas
        }
    }

    return 0;
}
