package week3.day13.test;

class CalendarPrinter {

	static void print(int[][] calendarArray, int year, int month) {

		System.out.printf("\t\t\t%d. %d\n", year, month);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

		for (int[] calendarA : calendarArray) {
			for (int calendar : calendarA) {
				if (calendar < 0) {
					System.out.print("\t");
				} else {
					System.out.print(calendar + "\t");
				}
			}
			System.out.println();
		}
	}
}
