package dao;

import java.util.ArrayList;

import dto.Soju;

public class SojuRepository {
	private ArrayList<Soju> listOfSojus=new ArrayList<Soju>();
	
	public SojuRepository() {
		Soju s1=new Soju("S1","C1",1300);
		s1.setDescription("�λ�");
		s1.setManufacturer("�뼱����");
		s1.setCategory("soju");
		s1.setUnitsInStock(10000);
		s1.setPer(17.5);
		
		Soju s2=new Soju("S2","��������",1300);
		s2.setDescription("�泲");
		s2.setManufacturer("����");
		s2.setCategory("soju");
		s2.setUnitsInStock(10000);
		s2.setPer(16.9);
		
		Soju s3=new Soju("S3","���̽�",1300);
		s3.setDescription("����");
		s3.setManufacturer("����Ʈ����");
		s3.setCategory("soju");
		s3.setUnitsInStock(10000);
		s3.setPer(20.5);
		
		Soju s4=new Soju("S4","�Ѷ��",1300);
		s4.setDescription("����");
		s4.setManufacturer("�Ѷ�����");
		s4.setCategory("soju");
		s4.setUnitsInStock(10000);
		s4.setPer(21);
		
		listOfSojus.add(s1);
		listOfSojus.add(s2);
		listOfSojus.add(s3);
		listOfSojus.add(s4);
	}
	public ArrayList<Soju> getAllSojus(){
		return listOfSojus;
	}
}
