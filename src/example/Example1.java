package example;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Sara1");
		myList.add("Sara2");
		myList.add("Sara3");
		myList.add("Sara4");
		//Affichage 1: Lambda expression
		myList.forEach(item->System.out.println(item));
		System.out.println("---------------");
		//Affichage 2: method reference
		myList.forEach(System.out::println);
		System.out.println("---------------");
		//Affichage 1: Lambda expression
		myList.stream().forEachOrdered(item->System.out.println(item));
		System.out.println("---------------");
		//Affichage 2: method reference
		myList.stream().forEachOrdered(System.out::println);

	}

}
