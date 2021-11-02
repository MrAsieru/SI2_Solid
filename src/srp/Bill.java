package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	
	public float billDeduction;
	public float VAT;
	public float billTotal;
	
	public VATCalculator bVAT = new MediumVAT();
	public Deduction bd = new ComplexDeduction();
	
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		billDeduction = bd.calculateDeduction(billAmount);
		// VATprecentage kalkulatzen dugu
		if (!"0".equals(code)) {
			VAT = bVAT.calculateVAT(billAmount);
		}else {
			VAT = 0;
		}
		
		// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VAT;
	}
	
}
