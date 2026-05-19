package pctEx01A;

public class Ex01A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner receba = new Scanner(System.in);
	        String[][] clientes = new String[3][2];
	        for (int i = 0; i < 3; i++) {

	            System.out.println("Cliente " + (i + 1));

	            System.out.print("Nome ")
	            clientes[i][0] = receba.nextLine();

	            System.out.print("Nome: ");
	            clientes[i][1] = receba.nextLine();

	            System.out.println();
	        }
	        System.out.println("Clientes cadastrados ");

	        for (int i = 0; i < 3; i++) {

	            System.out.println("Nome: " + clientes[i][0]);
	            System.out.println("Endereço: " + clientes[i][1]);
	            System.out.println();
	        }

	       
	    }

		
	}

