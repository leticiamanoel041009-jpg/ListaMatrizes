package pctEx02B;

public class Ex02B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] num = {
		            {19, 25, 100, 99},
		            {10, 7, 25, 14},
		            {35, 2, 47, 74}
		        };

		        for (int i = 0; i < num.length; i++) {

		            for (int j = 0; j < num[i].length; j++) {
		                System.out.print(num[i][j] + "\t");
		            }

		            System.out.println();
		        }


	}

}
