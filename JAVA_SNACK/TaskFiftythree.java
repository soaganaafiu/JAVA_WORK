An infinite loop is a loop that will forever be true and never gets to false so it keeps running forever



Eg: This is an infinite loop 
public class TaskFiftythree{
	public static void main(String[] args){

		
        int count = 1;

        while(count <= 10){
            System.out.print(number);
        }

	}
}



Eg: This is the correction

public class TaskFiftythree{
	public static void main(String[] args){

		
        int count = 1;

        while(count <= 10){
            System.out.print(number);
        count++;
        }

	}
}
