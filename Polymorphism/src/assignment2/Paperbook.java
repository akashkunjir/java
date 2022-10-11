package assignment2;

public class Paperbook extends Book {

	private double delchg;

	public Paperbook(double delchg) {
		super();
		this.delchg = delchg;
	}

	public Paperbook() {
		super();
	}

	public Paperbook(float p, double delchg) {
		super(p);
		this.delchg = delchg;
	}

	@Override
	public String toString() {
		return "Paperbook [" + super.toString() + " delchg=" + delchg + ", price=" + price + "]";
	}

	public double calCost() {
		double p = super.calCost();
		if (p <= 500) {
			p = p * 1.07;
		}

		else if (p > 500 && p <= 1000) {
			p = p * 1.05;
		}
		else if (p > 1000 && p <= 5000) {
			p = p * 1.02;
		}
		return p;
	}

}
