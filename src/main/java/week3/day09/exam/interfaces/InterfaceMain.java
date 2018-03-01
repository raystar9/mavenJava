package week3.day09.exam.interfaces;

class InterfaceMain {

	public static void main(String[] args) {
		SeparateVolume volume1 = new SeparateVolume("321", "Ant", "Bernard");
		volume1.checkOut("Koo", "2018-02-19");
		
		AppCDInfo cd = new AppCDInfo("2005-7001", "Redhat Fedora");
		cd.checkOut("Jung", "2018-02-16");
		
		volume1.checkOut("Jung", "2018-02-19");
		volume1.checkIn();
		volume1.checkOut("Jung", "2018-02-19");
	}

}
