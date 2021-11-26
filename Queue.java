package com.QuesandStack;


	import java.util.LinkedList;

	public class Queue {

		LinkedList<Integer> queue = new LinkedList<Integer>();

		public void enqueue(int value) {
			queue.addLast(value);
		}

		public void displayQueue() {
			for (Integer integer : queue) {
				System.out.print(" " + integer);
			}
			System.out.println();
		}

	}

