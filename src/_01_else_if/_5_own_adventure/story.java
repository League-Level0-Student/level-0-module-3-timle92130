package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class story {
public static void main(String[] args) {
	String course = JOptionPane.showInputDialog("wanna take the stort cut?");
	if (course.equals("yes")) {
		System.out.println("you ran intosome wolves who killed you Byeee!");
	}
		
	if (course.equals ("no")) {
		String sad;
		sad = JOptionPane.showInputDialog("A few people stop by and ask if you want to upgrade your ride for a faster tip, would you like to upgrade.");
		if (sad.equals("yes")) {
			System.out.println("The people robbed you and you died");
		}
		if (sad.equals("no")) {
			System.out.println("keep on doing what ur doing");
		}
			
		
	}

	}
	}
