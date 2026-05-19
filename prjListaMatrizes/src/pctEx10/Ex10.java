package pctEx10;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        int[][] matriz = new int[5][5];
		        int soma = 0;
		        System.out.println("--- Digite os elementos da Matriz 5x5 ---");
		        for (int l = 0; l < 5; l++) {
		            for (int c = 0; c < 5; c++) {
		                System.out.print("Linha " + (l + 1) + ", Coluna " + (c + 1) + ": ");
		                matriz[l][c] = scanner.nextInt();
		            }
		        }

		        for (int i = 0; i < 5; i++) {
		            soma += matriz[i][i]; 
		        }

		        System.out.println();
		        System.out.println("--- Matriz Digitada ---");
		        for (int l = 0; l < 5; l++) {
		            for (int c = 0; c < 5; c++) {
		                System.out.print(matriz[l][c] + "\t");
		            }
		            System.out.println();
		        }
		        System.out.println("\nSOMA DA DIAGONAL PRINCIPAL = " + soma);

		        scanner.close();
		    }
		}

	}

}
