package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> listOfProducts=new ArrayList<Product>();
	
	public ProductRepository() {
		Product Bacardi=new Product("P0000","Bacardi 151 degree",31000);
		Bacardi.setDescription("�Ҳ��� ��, 75.5%, Ǫ������ ����, ��������, ������ ���� ��¿��� ���� �ٽ��ϴ�.");
		Bacardi.setCategory("Rum");
		Bacardi.setManufacturer("Bacardi &Company");
		Bacardi.setUnitsInStock(80);
		Bacardi.setCondition("750ml");
		
		Product a=new Product("P0001","Bacardi 8 years",64000);
		a.setDescription("��ī���� ��ũ�� , 40%");
		a.setCategory("��");
		a.setManufacturer("Bacardi &Company");
		a.setUnitsInStock(10);
		a.setCondition("750ml");
		
		Product b=new Product("P0002","Ballantine's 30 years",550000);
		b.setDescription("�߷�Ÿ�ν� ����Ű�� ���� �� �����Ͽ� �ε巴���ϴ�. , 43%");
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
