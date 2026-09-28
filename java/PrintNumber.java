public class PrintNumber{
	public static void main(String[] args){
	
		int Sum = 0;

		for(int counter = 1; counter <= 30; counter++){
		
		if (counter % 3 == 0)
			Sum = Sum + counter;
		}

		System.out.print(Sum);
	}
}