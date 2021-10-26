package srp;

public class MediumVAT implements VATCalculator {

	public final float VATpercentage = (float) 0.18;

	@Override
	public float calculateVAT(float billAmount) {
		return (float) (billAmount * VATpercentage);
	}
}
