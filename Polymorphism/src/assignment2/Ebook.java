package assignment2;

public class Ebook extends Book {
	private double discount;

	public Ebook(float p) {
		super(p);
	}

	public Ebook(double discount) {
		super();
		this.discount = discount;
	}

	public Ebook(float p, double discount) {
		super(p);
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Ebook [ " + super.toString() + " discount=" + discount + ", price=" + price + "]";
	}

	public double calCost() {
		double p = super.calCost();
		if (p <= 500) {
			p = p * 0.98;
		}
		else if (p > 500 && p <= 1000) {
			p = p * 0.95;
		}
		else if (p > 1000 && p <= 5000) {
			p = p * 0.93;
		}

		return p;
	}

}
