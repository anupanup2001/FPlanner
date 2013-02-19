package com.nanosoft.fplanner;

public class FCalculator {
	
	/**
	 * 
	 * @param fCurrValue This is the current value whose inflation is to be calculated
	 * @param fYears Number of years after which inflated value is to be obtained
	 * @param fInflationRate Inflation rate p.a. Usually it is 6% in India
	 * @return Inflated value
	 */
	public static double calculateInflatedValue(double fCurrValue, double fYears, double fInflationRate) {
		return fCurrValue * Math.exp(fInflationRate/100.0 * fYears);
	}
	
	/**
	 * 
	 * @param fInterestRate Interest Rate p.a for the loan
	 * @param fPrincipal Amount borrowed
	 * @param nMonths Number of months for which it has been borrowed
	 * @return EMI per month required for loan taken
	 */
	public static double calculateEMI(double fInterestRate, double fPrincipal, double nMonths) {
	    return (fInterestRate/1200.0 * fPrincipal * (Math.pow(1 + fInterestRate/1200.0, nMonths))) / (Math.pow(1 + fInterestRate/1200.0, nMonths) - 1);
	}
	
	/**
	 * 
	 * @param fExpectedReturn Future Value of 
	 * @param fMonths
	 * @param fInterestRate
	 * @param fExpectedReturn Expected amount after n months
	 * @param fMonths Months after which amount is expected
	 * @param fInterestRate Interest rate pa. eg: 7.0

	 * @return Monthly SIP amount required for generating the corpus.
	 */
	public static double calculateSIPPerMonth(double fExpectedReturn, double fMonths, double fInterestRate) {
		return (fExpectedReturn * fInterestRate / 1200.0) / (Math.pow(1 + fInterestRate / 1200.0, fMonths) - 1) * (1 + fInterestRate / 1200.0); 
	
	}
	
	/**
	 * 
	 * @param fPrincipal Principal Amount at start
	 * @param fInterestRate Interest Rate p.a.
	 * @param fMonths Number of months for which amount is invested
	 * @return Final value of Investment
	 */

	public static double calculateCompoundInterest(double fPrincipal, double fInterestRate, double fMonths) {
		return fPrincipal * Math.pow(1 + fInterestRate/1200.0, fMonths);
	}

}
