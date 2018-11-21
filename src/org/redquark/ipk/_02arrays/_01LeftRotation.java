package org.redquark.ipk._02arrays;

import java.util.Scanner;

public class _01LeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        rotLeft(a, d);

        for (int i : a) {

            System.out.printf("%d ", i);
        }

        scanner.close();
    }

    private static void rotLeft(int[] a, int d) {

        // To make sure we handle if d > array.length
        d = d % a.length;

        // Dividing the array in two parts
        int x = a.length - d;

        reverse(a, 0, d - 1);
        reverse(a, d, a.length - 1);
        reverse(a, 0, a.length - 1);
    }

    private static void reverse(int[] a, int l, int r) {

        if (a == null || a.length == 1) {
            return;
        }

        while (l < r) {

            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}
