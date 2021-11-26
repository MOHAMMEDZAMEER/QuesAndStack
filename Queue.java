package com.QuesandStack;


	import java.util.LinkedList;

	public class Queue {

		LinkedList<Integer> queue = new LinkedList<Integer>();

		public void enqueue(int value) {
			queue.addLast(value);
		}

		public void dequeue() {
			if (queue.size()<1) {
				System.out.println(" Queue is Empty");
				
				else
					queue.remove();
			}
		}
		public void displayQueue() {
			for (Integer integer : queue) {
				System.out.print(" " + integer);
			}
			System.out.println();
		}

	}

