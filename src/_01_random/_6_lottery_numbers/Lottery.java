package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int number = random.nextInt(100); {
			int i = random.nextInt(100);
			int z = random.nextInt(100);
			int a = random.nextInt(100);
			int g = random.nextInt(100);
			int k = random.nextInt(100);
		JOptionPane.showMessageDialog(null, number + " " + i + " " + z + " " + a + " " + g + " " + k);
		
		}
		}
	}

