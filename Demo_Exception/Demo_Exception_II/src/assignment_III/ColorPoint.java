package assignment_III;

class ColorPoint extends Point {
	String color;
	int flag = 1;
	public static String[] colors;
	static {
		colors = new String[5];
		colors[0] = "Green";
		colors[1] = "Red";
		colors[2] = "Blue";
		colors[3] = "Pink";
		colors[4] = "Orange";
	}

	public ColorPoint(int x, int y, String c) throws InvalidColourException {
		super(x, y);
		for (int i = 0; i < 5; i++) {
			if (c.equals(colors[i])) {
				flag = 0;
				break;
			} else {
				flag = 1;
			}
		}
		if (flag == 0) {
			color = c;
		} else {
			throw new InvalidColourException();
		}

	}

	public ColorPoint() {
		super();
	}

	public String toString() {
		return color + " " + super.toString();
	}

}
