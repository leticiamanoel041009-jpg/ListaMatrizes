package pctEx01B;

public class Ex01B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        String[][] clientes = new String[3][3];
        for (int i = 0; i < 3; i++) {

            System.out.println("Cliente " + (i + 1));

            System.out.print("Nome: ");
            clientes[i][0] = entrada.nextLine();

            System.out.print("CPF: ");
            clientes[i][1] = entrada.nextLine();

            System.out.print("Telefone: ");
            clientes[i][2] = entrada.nextLine();

            System.out.println();
        }
        System.out.println("Dados dos clientes");

        for (int i = 0; i < 3; i++) {

            System.out.println("Nome: " + clientes[i][0]);
            System.out.println("CPF: " + clientes[i][1]);
            System.out.println("Telefone: " + clientes[i][2]);

            System.out.println();
        }

       
    }

	}
