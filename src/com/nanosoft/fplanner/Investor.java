package com.nanosoft.fplanner;

import java.util.ArrayList;

public class Investor {
	private String m_strName;
	private int m_nAge;
	private ArrayList<MileStone> m_milestones;
	public Investor(String name, int age) {
		m_strName = name;
		m_nAge = age;
		m_milestones = new ArrayList<MileStone>();
	}
	
	public void addMileStone(MileStone m) {
		m_milestones.add(m);
	}

	@Override
	public String toString() {
		String ret = "Investor Name: " + m_strName + "; Age: " + m_nAge + "; MileStones: " + m_milestones.size();
		return ret;
	}
	

}
