package com.nanosoft.fplanner;

public class MileStone {
	private int m_nHowManyMonthsLater;
	private double m_fAmount;
	private String m_strDescription;
	
	public MileStone (String strDesc, double amount, int nMonths) {
		m_strDescription = strDesc;
		m_fAmount = amount;
		m_nHowManyMonthsLater = nMonths;
	}

}
