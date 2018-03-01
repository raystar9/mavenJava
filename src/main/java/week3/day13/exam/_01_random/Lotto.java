package week3.day13.exam._01_random;

import java.util.Random;

class Lotto {

	public static void main(String[] args) {
		
		int[] numbers = generateLottoNumbers();
		
		sortWithoutBonus(numbers);
		print(numbers);
	}
	
	static int[] generateLottoNumbers() {
		int[] lottoArray = new int[7];
		for(int i = 0; i < 7; i++) {
			lottoArray[i] = d45_2();
			for(int j = 0; j < i; j++) {
				if(lottoArray[i] == lottoArray[j]) {
					j = 0;
					lottoArray[i] = d45_2();
				}
			}
		}
		return lottoArray;
	}
	
	static int d45() {
		return (int)(Math.random() * 45) + 1;
	}
	
	static int d45_2() {
		Random random = new Random();
		return random.nextInt(45) + 1;
		
	}
	
	static void sortWithoutBonus(int[] lottoArray) {
		for(int j = 0; j < lottoArray.length - 2; j++) {
			for (int i = 0; i < lottoArray.length - j - 2; i++) {
				if(lottoArray[i] > lottoArray[i + 1]) {
					swap(lottoArray, i, i+1);
				}
			}
		}
	}
	
	static void swap(int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}
	
	static void print(int[] lottoArray) {
		for(int i = 0; i < 7; i++) {
			if(i == 6) {
				System.out.print("Bonus : ");
			}
			System.out.println(lottoArray[i]);
		}
	}
}
