package week4.day14.test.calendar;

class CalendarPrinter {

	static void print(String[][] calendarArray, int year, int month) {

		System.out.printf("\t\t\t%d. %d\n", year, month);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

		for (String[] calendarA : calendarArray) {
			for (String calendar : calendarA) {
				if (Integer.valueOf(calendar) < 0) {
					System.out.print("\t");
				} else {
					System.out.print(calendar + "\t");
				}
			}
			System.out.println();
		}
	}
}
