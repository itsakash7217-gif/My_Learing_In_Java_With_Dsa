//You are given a string s of length
//        𝑛
//        2
//        . The string represents the elements of an
//        𝑛
//        ×
//        𝑛
//        matrix filled row by row.
//
//        A row or column in the matrix is called uniform if all the characters in that row or column are the same.
//
//        Return the total number of uniform rows and uniform columns in the matrix.
//
//        ✨ Example 1
//        Input:
//
//        Code
//        s = "aaaaabbbbbccccc"
//        Here,
//        𝑛
//        =
//        15
//        ≈
//        3
//        → but since length must be a perfect square, let’s use:
//
//        Code
//        s = "aaaaabbbbccccdddd"
//        so
//        𝑛
//        =
//        4
//        .
//
//        Matrix:
//
//        Code
//        a a a a
//        a b b b
//        c c c c
//        d d d d
//        Output:
//
//        Code
//        3
//        Explanation:
//
//        Row 0 → all 'a' → uniform
//
//        Row 2 → all 'c' → uniform
//
//        Row 3 → all 'd' → uniform
//
//        Column 0 → not uniform (a, a, c, d)
//
//        Column 1 → not uniform (a, b, c, d)
//
//        Column 2 → not uniform (a, b, c, d)
//
//        Column 3 → not uniform (a, b, c, d)
//        Total uniform rows + columns = 3.
//
//        ✨ Example 2
//        Input:
//
//        Code
//        s = "xxxxoooo"
//        Here,
//        𝑛
//        =
//        8
//        → invalid. Let’s use:
//
//        Code
//        s = "xxxxoooo"
//        with
//        𝑛
//        =
//        2
//        .
//
//        Matrix:
//
//        Code
//        x x
//        x x
//        o o
//        o o
//        Output:
//
//        Code
//        4
//        Explanation:
//
//        Row 0 → all 'x' → uniform
//
//        Row 1 → all 'x' → uniform
//
//        Row 2 → all 'o' → uniform
//
//        Row 3 → all 'o' → uniform
//        No column is uniform.
//        Total = 4.

package Accenture;
import java.util.*;
public class EachRowAndColumn {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = (int)Math.sqrt(s.length());
        char[][] arr = new char[n][n];
        int sl=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=s.charAt(sl++);
            }
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            int check=1;
            char has = arr[i][0];
            for (int j = 1; j < n; j++) {
                if(has==arr[i][j]) check++;
            }
            if(check==n) count++;
        }

        for (int i = 0; i < n; i++) {
            int check=1;
            char has = arr[0][i];
            for (int j = 1; j < n; j++) {
                if(has==arr[j][i]) check++;
            }
            if(check==n) count++;
        }
        System.out.println(count);
    }
}
