package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class LoLChamp {
	private String name;
	private int power;

	@Override
	public String toString() {
		return "LoLChamp [name=" + name + ", power=" + power + ", getPower()=" + getPower() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
public class ListTest2 {
	public static void main(String[] args) {
		String[] names = { "티모", "나미", "람머스", "나무", "징크스", "애쉬" };
		List<LoLChamp> lolList = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < names.length; i++) {
			LoLChamp kk = new LoLChamp();
			kk.setName(names[i]);
			kk.setPower(r.nextInt(51) + 50);
			lolList.add(kk);
		}
		for (int i = 0; i < names.length; i++) {
			LoLChamp kk = lolList.get(i);
			System.out.println(kk.getName() + "의 전투력은 =" + kk.getPower());
		}
		int max = 0;
		String a = "";
		for (int i = 0; i < names.length; i++) {
			LoLChamp kk = lolList.get(i);
			if (kk.getPower() > max) {
				max = kk.getPower();
				a = kk.getName();
			}
		}
		System.out.println("제일 강한애는 =" + a + "," + "전투력은 = " + max);
	}

}
