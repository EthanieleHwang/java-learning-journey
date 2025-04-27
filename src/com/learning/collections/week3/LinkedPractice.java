package com.learning.collections.week3;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedPractice {
    public static void main(String[] args) {
        System.out.println("---LinkedList Practice ---");

        //1. create a LinkedList of integers
        LinkedList<String> taskList = new LinkedList<>();

        //2.两端操作（Deque 方法）
        taskList.addFirst("Task 1:Design");
        taskList.addLast("Task 2:Implement");
        taskList.offerFirst("Task 0:Requirement"); //等价 addFirst
        taskList.offerLast("Task 3:Test"); //等价 addLast
        System.out.println("Initial task list: " + taskList);

        //3.作为栈（LIFO）使用
        System.out.println("\nUsing LinkedList as Stack:");
        Deque<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack: " + stack);
        System.out.println("Peek top: " + stack.peek()); //查看栈顶元素
        System.out.println("Pop: " + stack.pop()); //移除栈顶元素C
        System.out.println("Pop: " + stack.pop()); //移除栈顶元素B
        System.out.println("Stack after pops: " + stack); //剩下A

        //4.作为队列（FIFO）使用
        System.out.println("\nUsing LinkedList as Queue:");
        Deque<String> queue = new LinkedList<>();
        queue.offer("Job 1");
        queue.offer("Job 2");
        queue.offer("Job 3");
        System.out.println("Queue: " + queue);
        System.out.println("Peek front: " + queue.peek()); //查看队首元素Job 1
        System.out.println("Poll: " + queue.poll()); //移除队首元素Job 1
        System.out.println("Poll: " + queue.poll()); //移除队首元素Job
        System.out.println("Queue after polls: " + queue); //剩下Job 3

        //5.尝试通过索引访问
        taskList.add("Middle Task");
        System.out.println("taskList = " + taskList);
        System.out.println("\nAccessing elements by index:");
        System.out.println("ELement at index 1: " + taskList.get(1)); //Task 1:Design
        System.out.println("----------------");
    }
}
