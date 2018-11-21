/*
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks
 * with matching colors there are.
 *
 * For example, there are n = 7 socks with colors ar = [1, 2, 1, 2, 1, 3, 2]. There is one pair of color 1 and one of color 2.
 * There are three odd socks left, one of each color. The number of pairs is 2.
 */


package org.redquark.ipk._01warmup;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _01SockMerchant {

    private static final Scanner scanner = new Scanner(System.in);

    private static int sockMerchant(int n, int[] ar) {

        int counter = 0;
        Set<Integer> socks = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (socks.contains(ar[i])) {
                socks.remove(ar[i]);
                counter++;
            } else {
                socks.add(ar[i]);
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
