package objectlnObject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<personel> persons=new ArrayList<personel>();
       ArrayList<Title> titles=new ArrayList<Title>();
       ArrayList<Company> companys=new ArrayList<Company>();
       persons.add(new personel("idris", "koçacalý", 65, null, null));
       persons.add(new personel("emir", "tttt", 65, null, null));
       titles.add(new  Title("Metin 2",10));
       titles.add(new Title("Pubg Mobile",31));
       titles.add(new Title("Clash of clans",62));
       companys.add(new  Company("Microsoft","www.mirosoft.com"));
       companys.add(new  Company("Youtube","www.youtube.com"));
       companys.add(new  Company("Ýnstagram","www.instagram.com"));
       System.out.println(persons.get(0).getName());
       System.out.println(persons.get(1).getName());
       
            
       
       
       
	}
	}

