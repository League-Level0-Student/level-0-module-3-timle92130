package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class story {
public static void main(String[] args) {
	String course = JOptionPane.showInputDialog("wanna take the stork cut?");
	if (course.equals("yes")) {
		System.out.println("you ran intosome wolves who killed you Byeee!");
	}
		
	if (course.equals ("no")) {
		String sad;
		sad = JOptionPane.showInputDialog("Do you want to be happy");
		if (sad.equals("yes")) {
			System.out.println("change something");
		}
		if (sad.equals("no")) {
			System.out.println("keep on doing what ur doing");
		}
			
		
	}

	}
	}
