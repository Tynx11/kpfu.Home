package kpfu.homework.collection.Queue.Stackk;

import java.util.Scanner;

/**
 * Created by Tony on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] str = s.toCharArray();
        Stack stack = new ArrayStack(str.length);
        char check;
        for (char c : str) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    check = (char) stack.pop();
                    if (c == '}' && check !=  '{') {
                        return false;
                    } else if (c == ']' && check != '[') {
                        return false;
                    } else if (c == ')' && check != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
