a dangling else is an else statement that is not attached to the right if statement for example 


int age = 25;


if (age >= 27)
    if(age < 43)
        System.out.print("Geting old")
    else
        System.out.print("E shock me")




Resolved using braces 


if (age >= 27){

    if(age < 43){
        System.out.print("Geting old");
    }
 else{
      System.out.print("E shock me");}


}

