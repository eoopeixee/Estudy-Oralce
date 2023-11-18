package calculadoraAninha; 

import java.util.*;

public class ListaChamadaOrdenada {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar os nomes dos alunos
	        System.out.print("Quantos alunos na classe? ");
	        int numAlunos = scanner.nextInt();
	        scanner.nextLine(); // Consumir a quebra de linha pendente

	        List<String> nomesAlunos = new ArrayList<>();

	        for (int i = 0; i < numAlunos; i++) {
	            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
	            String nome = scanner.nextLine();
	            nomesAlunos.add(nome);
	        }

	        // Ordenar a lista de acordo com o número de letras nos nomes
	        nomesAlunos.sort(Comparator.comparingInt(String::length).reversed());

	        // Apresentar os nomes ordenados
	        System.out.println("\nLista de chamada ordenada por número de letras nos nomes:");

	        for (String nome : nomesAlunos) {
	            System.out.println(nome);
	        }

	        // Fechar o scanner
	        scanner.close();
	    }

}
