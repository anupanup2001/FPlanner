package com.nanosoft.fplanner;

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inflation = " + FCalculator.calculateInflatedValue(10000, 1, 6));
		System.out.println("EMI for loan: " + FCalculator.calculateEMI(10.25, 2290889, 20 * 12));
		System.out.println("Compound Interest: " + FCalculator.calculateCompoundInterest(10000, 12, 12));
		System.out.println("SIP required for 10000000: " + FCalculator.calculateSIPPerMonth(10000000, 30 * 12, 10));
		Investor a = new Investor("Anup", 27, 50000, 20, 10);
		//System.out.println("Investor Details: " + a);
		MileStone m = new MileStone("Car Purchase", 400000, 3 * 12);
		a.addMileStone(m);
		Advisor adv = new Advisor();
		adv.computeInvestmentStrategy(a);

	}

}
