public class Happiness{
    public static void main(String[] args){
   System.out.println(gradePoint(58));




    }

    public static String gradePoint(int number){
    if(number < 50) return "Get Better";

    else if(number > 50 && number <= 76.2)
   return "You're getting there";

    else return "Proficient";



}
        


}
