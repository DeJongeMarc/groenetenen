package be.vdab.valueobjects;

public class PostcodeReeks {
	private int vanpostcode;
	private int totpostcode;

	public int getVanpostcode() {
		return vanpostcode;
	}

	public int getTotpostcode() {
		return totpostcode;
	}

	public void setVanpostcode(int vanpostcode) {
		this.vanpostcode = vanpostcode;
	}

	public void setTotpostcode(int totpostcode) {
		this.totpostcode = totpostcode;
	}

	public boolean bevat(int postcode) {
		return postcode >= vanpostcode && postcode <= totpostcode;
	}

}
