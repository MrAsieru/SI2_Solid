package srp;

public class BasicDeduction implements Deduction {
	public int deductionPercentage;
	
	@Override
	public float calculateDeduction(float amount) {
		float deduction = 0;
		deduction = (amount * deductionPercentage) / 100;
		return deduction;
	}
}
