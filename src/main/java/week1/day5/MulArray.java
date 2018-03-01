package week1.day5;

public class MulArray {

	public static void main(String[] args) {
		int[][] table = new int[3][4];
		table[0][0] = 10;
		table[1][1] = 20;
		table[2][3] = table[0][0] + table[1][1];
		
		System.out.println(table.length);
		System.out.println(table[0].length);
		for (int j = 0; j < table.length; j++) {
			for (int i = 0; i < table[j].length; i++) {
				System.out.print(table[j][i]);
			}
			System.out.println();
		}
		
		int table2[][] = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12}};
		
		for(int j = 0; j < table2.length; j++) {
			for(int i = 0; i < table2[j].length; i++) {
				System.out.println("table["+j+"]["+i+"] = "+ table2[j][i] + "\t");
			}
		}
		
		int table3[][];
	}
}
