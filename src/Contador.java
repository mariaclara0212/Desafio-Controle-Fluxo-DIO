import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
    
        int parametroUm = terminal.nextInt();
        int parametroDois = terminal.nextInt(); 

        try {
            // Chamando o métido contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se o parametroUm é MAIOR que parametroDois e lançar exceção
        if (parametroUm > parametroDois) {
             throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        // realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo parametro 1: " + parametroUm + i);
            System.out.println("Imprimindo  parametro 2: " + parametroDois + i);
        }
        
    }

}

