package com.javaex.conditional;

public class SwitchEx3 {

	public static void main(String[] args) {
//		나중에 이 코드를 enum 클래스로 나중에 다시 만들예정.
		String day = "SUNDAY";
		String act;
		
		switch(day) {
		case "SUNDAY" :
			act = "휴식";
			break;
		case "MONDAY" :
			act = "열공";
			break;	
		case "TUESDAY" :
			act = "열공";
			break;
		case "WEDNESDAY" :
			act = "열공";
			break;
		case "THURSDAY" :
			act = "열공";
			break;
		case "FRIDAY" :
			act = "열공 후 불금";
			break;
		case "SATURDAY" :
			act = "방전";
			break;
		default:
			act = "여긴 어디?";
		}
		
		System.out.println(act);
		
		
		

	}

}
