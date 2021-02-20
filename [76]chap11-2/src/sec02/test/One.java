package sec02.test;

import java.util.*;
import java.text.*;

public class One {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 E요일 dd일 hh시 mm분");
		System.out.println(simple.format(now));
	}

}
