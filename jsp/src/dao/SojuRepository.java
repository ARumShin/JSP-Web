package dao;

import java.util.ArrayList;

import dto.Soju;

public class SojuRepository {
	private ArrayList<Soju> listOfProducts=new ArrayList<Soju>();
	
	public SojuRepository() {
		Soju s1=new Soju("S1","C1",1300);
		s1.setDescription("부산");
		s1.setManufacturer("대선주조");
		s1.setCategory("soju");
		s1.setUnitsInStock(10000);
		s1.setPer(17.5);
		
		Soju s2=new Soju("S2","좋은데이",1300);
		s2.setDescription("경남");
		s2.setManufacturer("무학");
		s2.setCategory("soju");
		s2.setUnitsInStock(10000);
		s2.setPer(16.9);
		
		Soju s3=new Soju("S3","참이슬",1300);
		s3.setDescription("서울");
		s3.setManufacturer("하이트진로");
		s3.setCategory("soju");
		s3.setUnitsInStock(10000);
		s3.setPer(20.5);
		
		Soju s4=new Soju("S4","한라산",1300);
		s4.setDescription("제주");
		s4.setManufacturer("한라산소주");
		s4.setCategory("soju");
		s4.setUnitsInStock(10000);
		s4.setPer(21);
		
		listOfProducts.add(s1);
		listOfProducts.add(s2);
		listOfProducts.add(s3);
		listOfProducts.add(s4);
	}
	public ArrayList<Soju> getAllProducts(){
		return listOfProducts;
	}
}
