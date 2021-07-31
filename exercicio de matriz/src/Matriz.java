import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];// matriz bidimencional, se for tridimencinal colocar 3x ->[]
		
		for(int i = 0; i<n; i++){
			for(int j = 0;j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.printf("Main diagonal:");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] +" ");
		}
		System.out.println();
		int count = 0;
		int count2 = 0;
		for(int i = 0; i<n; i++){
			for(int j = 0;j<n; j++) {///no caso do j<n pode ser usado o j<math[i].length que da no mesmo resultado da ação do sistema
				if (mat[i][j] < 0) {
					count++;
				}
				if (mat[i][j] > 0) {
					count2++;
				}
			}
		}
	
		System.out.println("negative number: "+ count);
		System.out.println("positive number: "+ count2);
		
		
		
		sc.close();
	}

}
