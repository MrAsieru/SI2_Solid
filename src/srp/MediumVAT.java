package srp;

public class MediumVAT implements VATCalculator {

	public final float VATprecentage = (float) 0.18;

	@Override
	public float calculateVAT(float billAmount) {
		return (float) (billAmount * VATprecentage);
	}

}
