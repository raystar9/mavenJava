package week1.day5.test;

public class Test2 {
	
	public static void main(String[] args) {
		
		String name[] = {"Hodong", "Seungki", "Jeseok", "Haha","Kwangsu"};
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
	        
	    for(c = 0; c < score.length; c++) {
		for(r = 0; r < score[r].length; r++) {
	        		subject[r] += score[c][r];
	        }
	    }
	        
	    for(r = 0; r < score[0].length; r++) {
	        for(c = 0; c < score.length; c++) {
	        	student[c] += score[c][r];
	        }
	    }
	    
	    System.out.println("===============Total score table ================");
	    System.out.printf("\t%s\t%s\t%s\t%s\t%s\n", sub_name[0], sub_name[1], sub_name[2],
				"Total", "Average");
	    for(int j = 0; j < score.length; j++) {
	    	
	    	System.out.print(name[j] + "\t");
	    	for(int i = 0; i < score[i].length; i++) {
	    		System.out.print(score[j][i] + "\t");
	    	}
	    	
	    	System.out.print(student[j]+ "\t");
	    	System.out.printf("%.1f\n",(double)student[j] / score[0].length);
	    }
	    
	    System.out.println("=================================================");
	    System.out.print("Total\t");
	    for(int i = 0; i < score[0].length; i++) {
	    	System.out.print(subject[i] + "\t");
	    }
	    
	}
}
