package ua.lviv.lgs.hw16;

public class Car {

	private String marka;
	private int rikVypusku;
	public int shvydkyst;

	public Car() {
	}

	public Car(String marka, int rikVypusku) {
		super();
		this.marka = marka;
		this.rikVypusku = rikVypusku;
	}

	public Car(String marka, int rikVypusku, int shvydkyst) {
		super();
		this.marka = marka;
		this.rikVypusku = rikVypusku;
		this.shvydkyst = shvydkyst;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getRikVypusku() {
		return rikVypusku;
	}

	public void setRikVypusku(int rikVypusku) {
		this.rikVypusku = rikVypusku;
	}

	public int getShvydkyst() {
		return shvydkyst;
	}

	public void setShvydkyst(int shvydkyst) {
		this.shvydkyst = shvydkyst;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		result = prime * result + rikVypusku;
		result = prime * result + shvydkyst;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		if (rikVypusku != other.rikVypusku)
			return false;
		if (shvydkyst != other.shvydkyst)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [marka=" + marka + ", rikVypusku=" + rikVypusku + ", shvydkyst=" + shvydkyst + "]";
	}

	public String getMarka() {
		return marka;
	}

	public void myMethod(String s) {
		System.out.println(s);
	}

	public void myMethod() {
		System.out.println("Yes!");
	}

}
