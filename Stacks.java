package com.QuesandStack;
	
	import java.util.LinkedList;

	public class Stacks {

		LinkedList<Integer> stack = new LinkedList<>();

		public void push(int value) {
			stack.add(0, value);
		}

		public void display() {
			for (Integer integer : stack) {
				System.out.print(" " + integer);
			}
			System.out.println();
		}
	}
