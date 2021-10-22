package srp;

public class ComplexDeduction implements Deduction {
	public int deductionPercentage;
	
	@Override
	public float calculateDeduction(float amount) {
		float deduction = 0;
		if (amount > 50000)
			 deduction = (amount * deductionPercentage +5) / 100;
			 else deduction = (amount * deductionPercentage) / 100;
		return deduction;
	}
}
