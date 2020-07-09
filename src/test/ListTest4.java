package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest4 {
	public static void main(String[] args) {
		String[] fNames = { "김", "이", "박", "최", "맹", "신", "조" };
		String[] lNames = { "동동", "나나", "진수", "명희", "철수", "명호", "둘리" };
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for (int i = 1; i < 20; i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student s = new Student();
			s.setName(fName + lName);
			s.setGrade(r.nextInt(3) + 1);
			stList.add(s);
		}
		int nums[] = new int[3];
		for (Student s : stList) {
			for (int i = 0; i < nums.length; i++) {
				if (s.getGrade() == (i + 1)) {
					nums[i]++;
				}
			}
		}
		System.out.println("1학년은" + nums[0] + "명" + "2학년은" + nums[1] + "명" + "3학년은" + nums[2] + "명");
	}
}
//for (int i = 0; i < stList.size(); i++) {
//Student s = stList.get(i);
//if (s.getGrade() == 1) {
//	nums[0]++;
//} else if (s.getGrade() == 2) {
//	nums[1]++;
//} else {
//	nums[2]++;
//}
//}