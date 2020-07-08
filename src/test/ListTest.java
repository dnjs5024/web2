package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student {
	private String name;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ListTest [name=" + name + ", grade=" + grade + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}

public class ListTest {
	public static void main(String[] args) {
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			Student st = new Student();
			stList.add(st);
			st.setName("이름" + i);
			st.setGrade(r.nextInt(10) + 1);

		}
		for (int i = 0; i < stList.size(); i++) {
			Student st = stList.get(i);
			int grade = st.getGrade();
			if (grade % 2 == 0) {
				System.out.println("이름 : " + st.getName() + ",학년 : " + st.getGrade());
			}

		}
		for (int i = 0; i < stList.size(); i++) {
			if (i % 2 == 1) {
				Student st = stList.get(i);
				System.out.println(st);
			}
		}
	}
}
