import java.util.Scanner;

public class MetodosManhã {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = obterNumero(scanner);

        // Solicita ao usuário para escolher a operação
        char operacao = obterOperacao(scanner);

        // Caso especial para operações unárias
        if (operacao == 's' || operacao == 'r' || operacao == 'l') {
            calcularOperacaoUnaria(numero1, operacao);
            scanner.close();
            return;
        }

        // Solicita ao usuário para inserir o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = obterNumero(scanner);

        // Realiza a operação selecionada
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                // Verifica se o segundo número não é zero antes de realizar a divisão
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    scanner.close();
                    return;
                }
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            default:
                System.out.println("Operação inválida.");
                scanner.close();
                return;
        }

        // Exibe o resultado
        System.out.println("Resultado: " + resultado);

        // Fecha o scanner
        scanner.close();
    }

    // Função para obter um número válido do usuário
    private static double obterNumero(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Digite um número: ");
            scanner.next(); // Limpa a entrada inválida
        }
        return scanner.nextDouble();
    }

    // Função para obter uma operação válida do usuário
    private static char obterOperacao(Scanner scanner) {
        System.out.print("Escolha a operação (+, -, *, /, ^ para potência, s para raiz quadrada, r para raiz cúbica, l para logaritmo): ");
        char operacao;
        while (true) {
            String input = scanner.next().toLowerCase();
            if (input.length() == 1) {
                operacao = input.charAt(0);
                if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/' || operacao == '^' || operacao == 's' || operacao == 'r' || operacao == 'l') {
                    break;
                }
            }
            System.out.print("Operação inválida. Tente novamente: ");
        }
        return operacao;
    }

    // Função para calcular operações unárias (raiz quadrada, raiz cúbica, logaritmo)
    private static void calcularOperacaoUnaria(double numero, char operacao) {
        double resultado = 0;
        switch (operacao) {
            case 's':
                resultado = Math.sqrt(numero);
                System.out.println("Raiz quadrada: " + resultado);
                break;
            case 'r':
                resultado = Math.cbrt(numero);
                System.out.println("Raiz cúbica: " + resultado);
                break;
            case 'l':
                resultado = Math.log10(numero);
                System.out.println("Logaritmo na base 10: " + resultado);
                break; 
        }
    }
}
