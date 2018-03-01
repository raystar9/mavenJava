package week3.day13.exam._03_customException;

class CalcMain {

	public static void main(String[] args) {
		try {
			System.out.println(subtract(5, 8));
		} catch (InvalidInputException e) {
			System.err.println(e.getMessage());
		}

	}

	static int subtract(int a, int b) throws InvalidInputException {
		if (a < b) {
			throw new InvalidInputException();
		}
		return a - b;
	}

}
