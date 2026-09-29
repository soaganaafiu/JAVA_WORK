System.out.println(i == 2);
//The output is true because 2 is equal to 2 


System.out.println(j == 5);
//In this situatuion j is represented as 3 so the output is fase because 3 is not equal to 5


System.out.println((i >= 0) && (j <= 3));

//Note the and operator states that bothe condition must be true so the first part 2 is greater than 0 (true) and 3 is less than or equal to 3 also (true) so this is true && true so this output is true 


System.out.println((m <= 100) & (k <= m));
//For the single and operator i think the first condition must be true to make it true so the first condition says 2 is less than or equal to 100 which is (true) and k is less than or equal to m which is true so the output is true 



System.out.println((j >= i) || (k != m));
//The or operator at least one must be true and for this condition the first one is false and also the second one to is false 



System.out.println((k + i < j) | (4 - j >= k));





System.out.println(!(k > j));
//This is the NOT operator. The stuff is 2 > 3 which is false so 2 is not greater than 3 which makes the output true
