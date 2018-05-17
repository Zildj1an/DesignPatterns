package command;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Command orden;
		
		System.out.println("Do you want to eat? (Y/N)");
		char answer = in.nextLine().charAt(0);
		
		if(answer == 'Y'){
			orden = new EatFood();
			
			System.out.println("Pizza or Hamburger? (1/2)");
			int ans = in.nextInt();
			
			if(ans == 1){
				orden.eat(new Pizza("pepperoni"));
			}
			else
				orden.eat(new Hamburger("cheese"));
		}
		else
			System.out.println("Nice!");
	}
}
