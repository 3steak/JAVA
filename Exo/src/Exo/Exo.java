package Exo;


import java.util.List;
import java.util.Random;


public class Exo {

	public static void main(String[] args) {
	
		List<Integer> randList = new Random().ints(10, 0, 100)
		        .boxed().toList();
		
		System.out.println(randList);
		System.out.println("----------------------");
		
		List<Integer> newList = randList.stream()
		.filter(nombre -> nombre%2 == 0).toList();
      
		System.out.println(newList);
	}

}
