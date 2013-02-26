package com.nanosoft.fplanner;

import java.util.ArrayList;

public class Investor {
	private String m_strName;
	private int m_nAge;
	private ArrayList<MileStone> m_milestones = new ArrayList<MileStone>();
	private double m_dSalaryPerMonth;
	private double m_dSavePercentage;
	private double m_dSalaryHikePercentagePerYear;
	public Investor(String name, int age, double dSalaryPerMonth, double dSavePercentage, 
			double dSalaryHikePercentagePerYear) {
		m_strName = name;
		m_nAge = age;
		m_dSalaryPerMonth = dSalaryPerMonth;
		m_dSavePercentage = dSavePercentage;
		m_dSalaryHikePercentagePerYear = dSalaryHikePercentagePerYear;
	}
	
	public void addMileStone(MileStone m) {
		m_milestones.add(m);
	}
	
	public ArrayList<MileStone> getMileStones() {
		return m_milestones;
	}

	@Override
	public String toString() {
		String ret = "Investor Name: " + m_strName + "; Age: " + m_nAge + "; MileStones: " + m_milestones.size();
		return ret;
	}
	

}
