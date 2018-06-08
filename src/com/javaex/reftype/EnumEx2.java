package com.javaex.reftype;

public class EnumEx2 {

	public static void main(String[] args) {
		Week today = Week.TUESDAY;
		String act;
		
		switch(today) {
		case SUNDAY:
			act = "휴식";
			break;
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
		case TURSDAY:
			act = "목요일이다";
			break;
		case FRIDAY:
			act = "금요일이다";
			break;
		case SATURDAY:
			act = "토요일이다";
			break;
		default:
			act = "난누구?";
		}
		System.out.println(act);
	}

}
