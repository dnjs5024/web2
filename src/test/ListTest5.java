package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food {
	private String Name;
	private int price;
	private String locale;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Override
	public String toString() {
		return "Food [Name=" + Name + ", price=" + price + ", locale=" + locale + "]";
	}

}

public class ListTest5 {

	public static void main(String[] args) {
		List<Food> fList = new ArrayList<>();
		String[] locales = { "한식", "양식", "중식", "일식", "분식", "경양식" };
		Random r = new Random();
		for (int i = 1; i <= 30; i++) {
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식" + i);
			f.setPrice((r.nextInt(10) + 1) * 1000);
			fList.add(f);
		}
		System.out.println(fList);
//		int max = 0;
//		int min = 10001;
//		String loc1 = "";
//		String loc2 = "";
//		String maxf = "";
//		String minf = "";
//
//		List<Food> Maxlist = new ArrayList<>();
//		List<Food> Minlist = new ArrayList<>();
//		for (int i = 0; i < fList.size(); i++) {
//			Food f = fList.get(i);
//			if (max < f.getPrice()) {
//				max = f.getPrice();
//				loc1 = f.getLocale();
//				maxf = f.getName();
//			}
//			if (min > f.getPrice()) {
//				min = f.getPrice();
//				loc2 = f.getLocale();
//				minf = f.getName();
//			}
//		}
//		for (int i = 0; i < fList.size(); i++) {
//			Food f = fList.get(i);
//			if (max == f.getPrice()) {
//				Maxlist.add(f);
//			}
//			if (min == f.getPrice()) {
//				Minlist.add(f);
//			}
//		}
		for (int i = 0; i < fList.size(); i++) {
			Food f = fList.get(i);

		}	

		int names[] = new int[6];
		for (int i = 0; i < 30; i++) {
			Food f = fList.get(i);
			for (int j = 0; j < locales.length; j++) {
				if (f.getLocale().equals(locales[j])) {
					names[j]++;
				}

			}

		}

//		System.out.println("제일비싼건=" + maxf + ", 가격은=" + max + "원" + ", 종류는=" + loc1);
//		System.out.println("제일싼건=" + minf + " ,가격은=" + min + "원" + ", 종류는=" + loc2);
//		System.out.println(Maxlist);
//		System.out.println(Minlist);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
