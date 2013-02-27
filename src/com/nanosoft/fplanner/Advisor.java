package com.nanosoft.fplanner;

import java.util.ArrayList;

public class Advisor {
	
	public void computeInvestmentStrategy(Investor inv) {
		ArrayList<MileStone> l_mileStones = inv.getMileStones();
		double l_dSalary = inv.getSalaryPerMonth();
		int l_numMileStones = l_mileStones.size();
		int l_nMaxMonths = 0;
		double l_dSavePercentage = inv.getSavePercentage();
		if (l_numMileStones > 0) {
			l_nMaxMonths = l_mileStones.get(l_numMileStones - 1).getMonthsRemaining();
		}
		
		//Create an array l_monthlySavings which indicate monthly saving capacity till last month of last goal.
		ArrayList<Double> l_monthlySavings = new ArrayList<Double>();
		
		for (int i = 0; i < l_nMaxMonths; i++) {
			if (i % 12 == 0 && i > 0) {
				//End of an year. Consider hike in salary
				l_dSalary = l_dSalary + l_dSalary * 0.10;
			}
			l_monthlySavings.add(l_dSalary * l_dSavePercentage/100.0);
			
		}
		
		for (MileStone ms : l_mileStones) {
			
			double l_dAmount = ms.getAmount();
			int l_nMonths = ms.getMonthsRemaining();
			double l_dInterestRate = 10;
			double l_dSip = FCalculator.calculateSIPPerMonth(l_dAmount, l_nMonths, l_dInterestRate);
			System.out.println("For investment " + ms.getDesc() + ", SIP required is Rs. " + l_dSip);
			
		}
	}

}
