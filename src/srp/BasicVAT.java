package srp;

public class BasicVAT implements VATCalculator {
	public final float VATpercentage = (float) 0.16;

	@Override
	public float calculateVAT(float billAmount) {
		return (float) (billAmount * VATpercentage);
	}
}