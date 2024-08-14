package com.bt.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSize {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();//Casting..
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("List values is : "+list);
		System.out.println("List size is : "+list.size());
	}
}
