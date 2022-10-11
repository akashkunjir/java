public class MyNum implements IntOperations {

	int num;

	public MyNum() {
		super();
	}

	public MyNum(int num) {
		super();
		this.num = num;
	}

	@Override
	public boolean isOdd(int num) {
		if (num % 2 == 1) {
			return true;

		} else {
			return false;
		}
	}

	@Override
	public boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;

		} else {
			return false;
		}
	}

	@Override
	public boolean isPrime(int num) {
		boolean p = true;
		for (int i = 2; i < num; i++)
			if (num % i == 0) {
				p = false;
				break;
			} else {
				p = true;
			}
		return p;
	}

	@Override
	public double calFact(int num) {

		double fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
