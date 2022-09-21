package recap_demo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double dizi[] = {3.2,4.3,2.5,7.4,77.5,32.5,100,500};
		double max_num = 0;
		double total = 0;
		
		
		for(double num:dizi) {
			total+=num;
			
		if(num>max_num) {
			max_num=num;
		}
		}

	
		System.out.println(max_num);
		System.out.println(total);
		
	}

}
