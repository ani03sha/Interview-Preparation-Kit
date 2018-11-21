/*
 * Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography.
 * During his last hike he took exactly n steps. For every step he took, he noted if it was an uphill, U, or a downhill, D step.
 * Gary's hikes start and end at sea level and each step up or down represents a 1 unit change in altitude.
 * We define the following terms:
 *
 * 1. A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending
 *    with a step down to sea level.
 * 2. A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending
 *    with a step up to sea level.
 *
 * Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
 *
 * For example, if Gary's path is s = [DDUUUUDD], he first enters a valley 2 units deep.
 * Then he climbs out an up onto a mountain 2 units high. Finally, he returns to sea level and ends his hike.
 *
 * Sample Input
 *
 *   8
 *   UDDDUDUU
 *
 *   Sample Output
 *
 *   1
 *   Explanation
 *
 *    If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:
 *
 *   _/\      _
 *      \    /
 *       \/\/
 *
 *   He enters and leaves one valley.
 *
 */


package org.redquark.org.redquark.ipk._01warmup;

import java.util.Scanner;

public class _02CountingValleys {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        System.out.println(countingValleys(n, s));

        scanner.close();
    }

    private static int countingValleys(int n, String s) {

        int count = 0;
        int valleys = 0;

        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);

            if (c == 'U') {
                count--;
            } else {
                count++;
            }

            if (count == 0 && c == 'U') {
                valleys++;
            }
        }

        return valleys;
    }
}
