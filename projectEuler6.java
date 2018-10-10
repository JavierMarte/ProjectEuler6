

public class projectEuler6 {

	public static int sum(int limit){
		
		int i = 1;
		int sumOne = 0;
		int sumTwo = 0;
		
		while(i <= limit){
			
			sumOne = (i * i) + sumOne;
			
			sumTwo += i;
			i++;
		}
		
		sumTwo = sumTwo * sumTwo;
		
		return (sumTwo - sumOne);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(sum(10));
	}

}
