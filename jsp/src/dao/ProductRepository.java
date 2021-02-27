package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> listOfProducts=new ArrayList<Product>();
	
	public ProductRepository() {
		Product Bacardi=new Product("P0000","Bacardi 151 degree",31000);
		Bacardi.setDescription("불꽃의 술, 75.5%, 푸에르토 리코, 사탕수수, 도수가 높아 상온에서 불이 붙습니다.");
		Bacardi.setCategory("Rum");
		Bacardi.setManufacturer("Bacardi &Company");
		Bacardi.setUnitsInStock(80);
		Bacardi.setCondition("750ml");
		
		Product a=new Product("P0001","Bacardi 8 years",64000);
		a.setDescription("바카디의 다크럼 , 40%");
		a.setCategory("럼");
		a.setManufacturer("Bacardi &Company");
		a.setUnitsInStock(10);
		a.setCondition("750ml");
		
		Product b=new Product("P0002","Ballantine's 30 years",550000);
		b.setDescription("발렌타인스 위스키는 블렌딩 후 숙성하여 부드럽습니다. , 43%");
		b.setCategory("Whiskey");
		b.setManufacturer("Ballantine");
		b.setUnitsInStock(0);
		b.setCondition("700ml");
		
		listOfProducts.add(Bacardi);
		listOfProducts.add(a);
		listOfProducts.add(b);
		
	}
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}

}
