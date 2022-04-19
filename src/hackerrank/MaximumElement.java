package hackerrank;

import java.util.Scanner;
import java.util.Stack;

//https://www.hackerrank.com/challenges/maximum-element/problem

public class MaximumElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> max = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for (int i = 0; i <= size; i++) {
            int input = sc.nextInt();
            if (input == 1) {
                int data = sc.nextInt();
                st.push(data);
                if (max.isEmpty() || data >= max.peek()) {
                    max.push(data);
                }
            } else if (input == 2) {
                int data = st.pop();
                if (data == max.peek()) {
                    max.pop();
                }
            } else if (input == 3) {
                System.out.println(max.peek());
            }
        }
    }
}