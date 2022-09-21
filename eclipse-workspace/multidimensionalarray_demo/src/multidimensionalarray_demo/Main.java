package multidimensionalarray_demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] table = new int[3][3];
		int top = 0;
		
		table[0][0] = 10;
		table[0][1] = 12;
		table[0][2] = 5;
		table[1][0] = 2;
		table[1][1] = 56;
		table[1][2] = 24;
		table[2][0] = 113;
		table[2][1] = 78;
		table[2][2] = 45;
		
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++) {
				
				top+=table[i][j];
				
			}
			System.out.println((i+1) + ". satırın toplamı;");
			System.out.println(top);
			System.out.println("-------------------");
		}
		
		
	}

}
