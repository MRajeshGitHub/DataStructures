package com.bt.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check arrayList is Empty or Not...");
		
		List<Integer> lst= new ArrayList<>();
		if (lst.isEmpty()) {
			System.out.println("list is Empty..");
		}
		else
			System.out.println("list is not Empty..");

	}

}
