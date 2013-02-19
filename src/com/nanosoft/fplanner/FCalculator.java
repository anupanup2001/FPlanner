package com.nanosoft.fplanner;

public class FCalculator {
	public static double calculateInflatedValue(double fCurrValue, double fYears, double fInflationRate) {
		return fCurrValue * Math.exp(fInflationRate/100.0 * fYears);
	}
	
	/**
	 * Some people call it Amortization but I prefer to call it EMI :)
	 * @return
	 */
	public static double calculateEMI(double fInterestRate, double fPrincipal, double nMonths) {
	    return (fInterestRate/1200.0 * fPrincipal * (Math.pow(1 + fInterestRate/1200.0, nMonths))) / (Math.pow(1 + fInterestRate/1200.0, nMonths) - 1);
	}

}
