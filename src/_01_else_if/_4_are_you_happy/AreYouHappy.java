package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		
	
String happy = JOptionPane.showInputDialog("Are you happy?");
if (happy.equals("yes")) {
	System.out.println("Keep on doing what ever you are doing!");
	System.exit(0);
}
	
if (happy.equals ("no")) {
	String decsion;
	decsion = JOptionPane.showInputDialog("A family is stranded on the road would you like to help them?");
	if (decsion.equals("yes")) {
		System.out.println("cIt turns out they are a very rich family who own a air plane company. You will never have to travel by car for the rest of your life.");
	}
	if (decsion.equals("no")) {
		System.out.println("Karma gets to you are you fall off a cliff and die byee!");
		System.exit(0);
	}
		
	
}

}
}
