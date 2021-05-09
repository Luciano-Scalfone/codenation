package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {
	static List<Integer> fibonacciList = new ArrayList<>();
	static int number = 0;

	public static List<Integer> fibonacci() {
		fibonacciList.add(0);
		fibonacciList.add(1);

		while(number < 350) {
			number = fibonacciList.get(fibonacciList.size() - 1) + fibonacciList.get(fibonacciList.size() - 2);
			fibonacciList.add(number);
		};

		System.out.println(fibonacciList);

		return fibonacciList;
	}

	public static Boolean isFibonacci(Integer a) {
		fibonacciList.add(0);
		fibonacciList.add(1);

		while(number <= a) {
			number = fibonacciList.get(fibonacciList.size() - 1) + fibonacciList.get(fibonacciList.size() - 2);
			fibonacciList.add(number);
		};

		if(fibonacciList.indexOf(a) >= 0) {
			return true;
		};

		return false;
	}
}