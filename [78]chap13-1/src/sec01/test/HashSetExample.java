package sec01.test;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1,"홍길동"));
		set.add(new Student(2,"홍길동"));
		set.add(new Student(1,"홍길동"));
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student=iterator.next();
			System.out.println(student.studentNum+" : "+student.name);
		}
	}

}
