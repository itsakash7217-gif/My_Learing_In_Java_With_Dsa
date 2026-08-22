//📝 Problem Statement
//        You are given a matrix of size n × m filled with lowercase English letters.
//        A row in this matrix is called uniform if all the characters in that row are the same.
//
//        Return the number of uniform rows in the matrix.
//
//        ✨ Example 1
//        Input:
//
//        Code
//        n = 3, m = 4
//        matrix = [
//        ['a','a','a','a'],
//        ['b','b','b','b'],
//        ['c','d','c','d']
//        ]
//        Output:
//
//        Code
//        2
//        Explanation:
//
//        Row 0 → all 'a' → uniform
//
//        Row 1 → all 'b' → uniform
//
//        Row 2 → contains both 'c' and 'd' → not uniform
//        Hence, the answer is 2.
//
//        ✨ Example 2
//        Input:
//
//        Code
//        n = 2, m = 3
//        matrix = [
//        ['x','x','x'],
//        ['y','z','y']
//        ]
//        Output:
//
//        Code
//        1
//        Explanation:
//        Only the first row is uniform (x x x). The second row has both y and z.
//
//        🔒 Constraints
//        1
//        ≤
//        𝑛
//        ,
//        𝑚
//        ≤
//        100
//
//        Matrix elements are lowercase English letters ('a'–'z').
package Accenture;
import java.util.*;
public class UniqueRow {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int u = 0;
            int check = matrix[i][0];
            for (int j = 0; j < m; j++) {
                if(check==matrix[i][j]) u++;
            }
            if(u==m) count++;
        }
        System.out.println(count);
    }
}
