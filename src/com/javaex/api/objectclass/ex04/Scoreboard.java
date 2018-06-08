package com.javaex.api.objectclass.ex04;

public class Scoreboard {
	private int scores[];
	
	//생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	public Scoreboard getClone() {	//복제 과정
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	@Override
	public String toString() {
		String output = "Scoreboeard(";
		
		for(int i = 0; i<scores.length; i++) {
			output += scores[0];
			if(i < scores.length -1) {
				output += ",";	//(0,0,0,0, <-마지막 , 안찍으려고 꼼수코딩
			}
		}
		output += ")";
		
		return output;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	
}
