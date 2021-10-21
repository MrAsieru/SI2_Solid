package srp;

public class BasicDeduction implements Deduction {
	public int deductionPercentage;
	
	@Override
	public float calculateBillDeduction(float amount) {
		float deduction = 0;
		if (amount > 50000)
			 deduction = (amount * deductionPercentage +5) / 100;
			 else deduction = (amount * deductionPercentage) / 100;
		return deduction;
	}
}
