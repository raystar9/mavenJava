package week4.day16.exam._02_calcPi;

class CalcPiMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long endTime;
		double total = 0.0;
		double pi;
		for(int cnt = 1; cnt < 1000000000; cnt += 2) {
			if(cnt/2 % 2 == 0) {
				total += 1.0 / cnt;
			} else {
				total -= 1.0 / cnt;
			}
		}
		pi = total * 4;
		System.out.println(pi);
		endTime = System.currentTimeMillis();
		System.out.println("took " + (endTime - startTime)/1000D + " second");
	}
	

}
