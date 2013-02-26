package com.nanosoft.fplanner;

import java.util.ArrayList;

public class Advisor {
	
	public void computeInvestmentStrategy(Investor inv) {
		ArrayList<MileStone> l_mileStones = inv.getMileStones();
		
		for (MileStone ms : l_mileStones) {
			System.out.println(ms);
		}
	}

}
