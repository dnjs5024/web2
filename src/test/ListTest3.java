package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest3 {

	public static void main(String[] args) {
		String[] fNames = { "김", "이", "박", "최", "맹", "신", "조" };
		String[] lNames = { "동동", "나나", "진수", "명희", "철수", "명호", "둘리" };
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for (int i = 1 ; i < 20; i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student s = new Student();
			s.setName(fName + lName);
			s.setGrade(r.nextInt(3) + 1);
			stList.add(s);
		}
		for (Student s : stList) {
			System.out.println(s);
		}
		List<Student> oneList = new ArrayList<>();
		List<Student> twoList = new ArrayList<>();
		List<Student> threeList = new ArrayList<>();
		for (Student s : stList) {
			if (s.getGrade() == 1) {
				oneList.add(s);
			}
			if (s.getGrade() == 2) {
				twoList.add(s);
			}
			if (s.getGrade() == 3) {
				threeList.add(s);
			}

		}
		if (oneList.size() > 0) {
			System.out.print("1학년은 = " + oneList.size() + "명   " + "이름은? = ");
			for (Student s : oneList) {
				System.out.print(s.getName() + ",");
			}
		}
		if (twoList.size() > 0) {
			System.out.println();
			System.out.print("2학년은 = " + twoList.size() + "명   " + "이름은? = ");
			for (Student s : twoList) {
				System.out.print(s.getName() + ",");
			}
		}
		if (threeList.size() > 0) {
			System.out.println();
			System.out.print("3학년은 = " + threeList.size() + "명   " + "이름은? = ");
			for (Student s : threeList) {
				System.out.print(s.getName() + ",");
			}
		}
		System.out.println();
int[ ]nums = new int[3];
	nums [0]=oneList.size();
	nums [1]=twoList.size();
	nums [2]=threeList.size();
	for (int i=0;i<nums.length;i++) {
		System.out.print((i+1)+"학년은 = " + nums[i] + "명   " + "이름은? = ");
		for (Student s : oneList) {
			System.out.print(s.getName() + ",");
		}
		System.out.println();
	}
			
	}
}

// 위의 리스는는 1-3학년까지 랜덤하게 들어간 리스트입니다
//각 학년당 몇명의 학생이 있는지 출력하는 프로그램을 만들어
