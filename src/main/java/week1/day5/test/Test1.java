package week1.day5.test;

public class Test1 {
	
	public static void main(String[] args) { 
		
		String name[] = {"KangHodong", "LeeSeungki", "YuJeseok", "Haha","LeeKwangsu"};
		String sub_name[] = {"Korean", "Math","English"};
	        int [][]score = { { 85,  60,  70},
	        		{ 90,  95,  80},
	        		{ 75,  80, 100},
	        		{ 80,  70,  95},
	        		{100,  65,  80}
	        };
	        int [] subject = new int[3]; 
	        int [] student = new int[5];
	        
	        int r, c;
	        System.out.println("Total score by subject");
	        
	        for(c = 0; c < score.length; c++) {
	        	subject[0] += score[c][0];
	        	subject[1] += score[c][1];
	        	subject[2] += score[c][2];
	        }
	        
	        for(int i = 0; i < score[0].length; i++) {
	        	System.out.println(sub_name[i] + " = " + subject[i]);
	        }
	        
	        System.out.println();
	        
	        System.out.println("Total score by student");
	        
	        for(r = 0; r < score[0].length; r++) {
	        	for(c = 0; c < score.length; c++) {
	        		student[c] += score[c][r];
	        	}
	        	/*student[0] += score[0][r];
	        	student[1] += score[1][r];
	        	student[2] += score[2][r];
	        	student[3] += score[3][r];
	        	student[4] += score[4][r];*/
	        }
	        
	        for(int i = 0; i < score.length; i++) {
	        	System.out.println(name[i] + " = " + student[i] );
	        }
	        
	}
}
