package Java.HelpersToPrint;

import Java.LeetCode.templates.DoublyListNode;
import Java.LeetCode.templates.ListNode;
import Java.LeetCode.templates.TreeNode;
import Java.LeetCode.flatten.list.Node;
import Java.LeetCode.flatten.list.SinglyNode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Author: Nitin Gupta(nitin.gupta@walmart.com)
 * Date: 2019-07-24
 * Description:
 */
public class GenericPrinter {

    public static void print(final int[] a) {
        System.out.println();
        System.out.print("[ ");
        Arrays.stream(a).forEach(i -> System.out.print(i + " "));
        System.out.print("]");
        System.out.println();

    }

    public static void print(final int[][] a) {
        System.out.println();

        for (int[] ints : a) {
            System.out.println();
            Arrays.stream(ints).forEach(x -> System.out.print(x + " "));
        }
        System.out.println();
    }


    public static void print(final char[][] a) {
        System.out.println();

        for (char[] chars : a) {
            System.out.println();
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(chars[j] + " ");
            }

        }
        System.out.println();
    }

    public static void print(final List<int[]> list) {

        System.out.println();
        for (int[] i : list) {

            System.out.print(" ( ");
            for (int x = 0; x < i.length; x++) {
                System.out.print(i[x]);
                if (x != i.length - 1)
                    System.out.print(" , ");
            }
            System.out.print(" ) ");
        }
    }

    public static String toString(int[] nums) {
        if (null == nums || nums.length == 0)
            return null;

        StringBuilder result = new StringBuilder("[");

        for (int num : nums) {
            result.append(num);
            result.append(",");
        }
        result.setCharAt(result.length() - 1, ']');

        return result.toString();
    }

    public static <T> String toString(T[] nums) {
        if (null == nums || nums.length == 0)
            return null;

        StringBuilder result = new StringBuilder("[");

        for (T num : nums) {
            result.append(num);
            result.append(",");
        }
        result.setCharAt(result.length() - 1, ']');

        return result.toString();
    }


    public static String toString(double[] nums) {
        if (null == nums || nums.length == 0)
            return null;

        StringBuilder result = new StringBuilder("[");

        for (double num : nums) {
            result.append(num);
            result.append(",");
        }
        result.setCharAt(result.length() - 1, ']');

        return result.toString();
    }

    public static String toString(char[] nums) {
        if (null == nums || nums.length == 0)
            return null;

        StringBuilder result = new StringBuilder("[");

        for (char num : nums) {
            result.append(num);
            result.append(",");
        }
        result.setCharAt(result.length() - 1, ']');

        return result.toString();
    }


    public static String toString(String[] str) {
        if (null == str || str.length == 0)
            return null;

        StringBuilder result = new StringBuilder("[");

        for (String s : str) {
            result.append(s);
            result.append(",");
        }
        result.setCharAt(result.length() - 1, ']');

        return result.toString();
    }

    public static String toString(int[][] nums) {
        if (null == nums || nums.length == 0)
            return null;

        StringBuilder result = new StringBuilder();
        for (int[] num : nums) {


            result.append(toString(num));
            result.setCharAt(result.length() - 1, ']');
        }


        return result.toString();

    }

    public static String toString(List<Integer>[] nums) {
        if (null == nums || nums.length == 0)
            return null;

        StringBuilder result = new StringBuilder();
        for (List<Integer> num : nums) {


            result.append(num);
            result.append("\n");
        }


        return result.toString();

    }

    public static String toStringInline(int[][] nums) {
        if (null == nums || nums.length == 0)
            return null;

        StringBuilder result = new StringBuilder();
        for (int[] num : nums) {


            result.append(toString(num));
            result.setCharAt(result.length() - 1, ']');
            result.append(",");
        }


        return result.toString();

    }


    public static String toString(char[][] nums) {
        if (null == nums || nums.length == 0)
            return null;

        StringBuilder result = new StringBuilder();
        for (char[] num : nums) {


            result.append(toString(num));
            result.setCharAt(result.length() - 1, ']');
        }


        return result.toString();

    }


    public static String toString(final List<int[]> list) {
        if (null == list || list.size() == 0)
            return null;

        StringBuilder result = new StringBuilder();
        for (int[] x : list) {
            result.append(toString(x)).append(",");
        }

        return result.toString().substring(0, result.length() - 1);
    }


    public static int[] copyOf(int[] input) {
        int[] copy = new int[input.length];

        System.arraycopy(input, 0, copy, 0, input.length);

        return copy;
    }


    public static int[][] copyOf(int[][] input) {
        int[][] copy = new int[input.length][input[0].length];

        for (int i = 0; i < input.length; i++)
            System.arraycopy(input[i], 0, copy[i], 0, input[0].length);

        return copy;
    }

    public static char[] copyOf(char[] input) {
        char[] copy = new char[input.length];

        System.arraycopy(input, 0, copy, 0, input.length);

        return copy;
    }


    public static char[][] copyOf(char[][] input) {
        char[][] copy = new char[input.length][input[0].length];

        for (int i = 0; i < input.length; i++)
            System.arraycopy(input[i], 0, copy[i], 0, input[0].length);

        return copy;

    }


    public static <T> T[] copyOf(T[] input) {

        if (input == null || input.length == 0)
            return input;
        int n = input.length;
        return Arrays.copyOf(input, input.length);
    }


    public static List<Integer> preOrder(TreeNode root) {
        final List<Integer> preOrder = new LinkedList<>();

        if (null == root)
            return preOrder;

        preOrderUtil(root, preOrder);

        return preOrder;
    }


    public static void preOrderUtil(TreeNode root, List<Integer> preorder) {

        if (null == root) {
            preorder.add(null);
            return;
        }

        preorder.add(root.val);
        preOrderUtil(root.left, preorder);
        preOrderUtil(root.right, preorder);

    }

    public static List<Integer> inOrder(TreeNode root) {
        final List<Integer> inOrder = new LinkedList<>();

        if (null == root)
            return inOrder;

        inOrderUtil(root, inOrder);

        return inOrder;
    }


    public static void inOrderUtil(TreeNode root, List<Integer> inOrder) {

        if (null == root)
            return;


        inOrderUtil(root.left, inOrder);
        inOrder.add(root.val);
        inOrderUtil(root.right, inOrder);

    }


    public static <T extends SinglyNode> List<T> print(T head) {

        List<T> nodes = new ArrayList<>();

        T temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = (T) temp.next;
        }

        return nodes;
    }

    public static <T extends Node> List<T> print(T head) {

        List<T> nodes = new ArrayList<>();

        T temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = (T) temp.next;
        }

        return nodes;
    }

    public static <T extends TreeNode> List<T> print(T head) {

        List<T> nodes = new ArrayList<>();

        T temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = (T) temp.right;
        }

        return nodes;
    }

    public static <T extends ListNode> List<T> print(T head) {

        List<T> nodes = new ArrayList<>();

        T temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = (T) temp.next;
        }

        return nodes;
    }

    public static <T extends DoublyListNode> List<T> print(T head) {

        List<T> nodes = new ArrayList<>();

        T temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = (T) temp.next;
        }

        return nodes;
    }


    public static <T extends ListNode> List<List<T>> print(T[] heads) {

        List<List<T>> nodes = new ArrayList<>();

        for (T t : heads)
            nodes.add(print(t));

        return nodes;

    }


    public static <T extends TreeNode> List<T> printCircular(T head) {

        List<T> nodes = new ArrayList<>();

        T temp = head;

        while (temp != null) {
            nodes.add(temp);
            temp = (T) temp.right;

            if (temp == head) {
                nodes.add(temp);//if it was circular, then state it for testing purpose
                break;
            }
        }


        return nodes;
    }


    public static List<Integer> reverse(Integer[] elements) {
        return Arrays.stream(elements)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public static List<Integer> reverse(List<Integer> elements) {
        return elements.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }

    public static <I, E> void inputPrint(I[] input, E[] expected, String inputString) {
        System.out.println("-----------");
        System.out.println(inputString + ": " + GenericPrinter.toString(input));
        System.out.println("Expected :" + GenericPrinter.toString(expected));

    }

    public static <I, E> void inputPrint(I[][] input, E[] expected, String inputString) {
        System.out.println("-----------");
        System.out.println(inputString + ": " + GenericPrinter.toString(input));
        System.out.println("Expected :" + GenericPrinter.toString(expected));

    }


    public static <I, E> void inputPrint(I[][] input, E[][] expected, String inputString) {
        System.out.println("-----------");
        System.out.println(inputString + ": " + GenericPrinter.toString(input));
        System.out.println("Expected :" + GenericPrinter.toString(expected));

    }

    public static <I, I2, E> void inputPrint(I[] input1, I2[] input2, E[] expected, String inputString1, String inputString2) {
        System.out.println("-----------");
        System.out.println(inputString1 + ": " + GenericPrinter.toString(input1));
        System.out.println(inputString2 + ": " + GenericPrinter.toString(input2));
        System.out.println("Expected :" + GenericPrinter.toString(expected));

    }

    public static <I, I2, E> void inputPrint(I[] input1, I2[][] input2, E[] expected, String inputString1, String inputString2) {
        System.out.println("-----------");
        System.out.println(inputString1 + ": " + GenericPrinter.toString(input1));
        System.out.println(inputString2 + ": " + GenericPrinter.toString(input2));
        System.out.println("Expected :" + GenericPrinter.toString(expected));

    }

    public static <I, I2, E> void inputPrint(I[][] input1, I2[][] input2, E[] expected, String inputString1, String inputString2) {
        System.out.println("-----------");
        System.out.println(inputString1 + ": " + GenericPrinter.toString(input1));
        System.out.println(inputString2 + ": " + GenericPrinter.toString(input2));
        System.out.println("Expected :" + GenericPrinter.toString(expected));

    }

    public static <I, I2, E> void inputPrint(I[][] input1, I2[][] input2, E[][] expected, String inputString1, String inputString2) {
        System.out.println("-----------");
        System.out.println(inputString1 + ": " + GenericPrinter.toString(input1));
        System.out.println(inputString2 + ": " + GenericPrinter.toString(input2));
        System.out.println("Expected :" + GenericPrinter.toString(expected));

    }

    public static void main(String[] args) {

        int[] x = {1, 2, 3};
        System.out.println(toString(copyOf(x)));

        int[][] x2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] x2d = copyOf(x2);
        System.out.println(x2 == x2d);

        System.out.println(toString(new int[]{1, 3, 4}));
        System.out.println(toString(new int[][]{{1, 3, 4}, {7, 8, 9}, {10, 11, 12}}));
        System.out.println(toString(new char[]{'a', 'b', 'c'}));
        System.out.println(toString(new char[][]{{'a', 'b', 'c'}, {'x', 'y', 'z'}, {'t', 'y', 'p'}}));
    }


}