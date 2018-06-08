package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
//		Goods notebook = new Goods();
//		notebook.name = "Dell XPS";
//		notebook.price = 2000000;
//		notebook.setName("Dell XPS");
//		notebook.setPrice(200000);
		Goods notebook = new Goods("Dell XPS", 2000000);
//		Goods camera = new Goods();	//만들어 놓은 필드
//		camera.name = "Nikon";	//멤버 필드
//		camera.price = 700000;
//		camera.setName("Nikon");
//		camera.setPrice(70000);
		Goods camera = new Goods("Nikon", 700000);
		
//		System.out.printf("%s, %d원", notebook.name, notebook.price);
//		System.out.printf("%s, %d원", camera.name, camera.price);
		System.out.printf("%s, %d원%n", 
				notebook.getName(),
				notebook.getPrice());
		
				notebook.showInfo();
		System.out.printf("%s, %d원", 
				camera.getName(),
				camera.getPrice());
		
				camera.showInfo();
	}

}
