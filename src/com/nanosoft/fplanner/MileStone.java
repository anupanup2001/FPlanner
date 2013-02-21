package com.nanosoft.fplanner;

public class MileStone {
	private int m_nHowManyMonthsLater;
	private double m_fAmount;
	private String m_strDescription;
	private double m_fMonthlyInvReqd;
	private boolean m_bIsLoan;
	
	
	public MileStone (String strDesc, double amount, int nMonths) {
		m_strDescription = strDesc;
		m_fAmount = amount;
		m_nHowManyMonthsLater = nMonths;
		m_bIsLoan = false;
	}
	
	
	public MileStone (String strDesc, double amount, int nMonths, double fMonthlyInvReqd) {
		this(strDesc, amount, nMonths);	
		m_fMonthlyInvReqd = fMonthlyInvReqd;
		m_bIsLoan = true;
	}

}
