package core.comparison.test.manual;

import java.util.Objects;

import core.comparison.Person;

public class CompareTest {
	public static void main(String[] args) {
		Person p1=new Person("Deru","Berlin");
		Person p2=new Person("Rabu","Tokyo");
		
		System.out.println(Objects.hashCode(p1));
		System.out.println(p1.hashCode());
	}
}
