//You are given a list of integers and a string consisting only of characters 'R' and 'G'.
//Each integer in the list represents the number of consecutive 'G' characters you must successfully consume after skipping any leading 'R' characters.
//
//Starting from the beginning of the string, for each integer r in the list:
//
//Skip all consecutive 'R' characters.
//
//Count the number of consecutive 'G' characters.
//
//If the count of 'G' characters is at least r, you succeed and move forward by r positions.
//
//If any requirement fails, the process stops immediately and the final answer is 0.
//
//Return the total number of successful integers consumed only if all requirements are satisfied. Otherwise, return 0.
//
//✨ Example 1
//Input:
//
//Code
//list = [2, 1]
//s = "RRGGG"
//Output:
//
//Code
//2
//Explanation:
//
//First integer = 2 → skip 'RR', then 'GGG'. At least 2 'G' available → success.
//
//Second integer = 1 → one 'G' remains → success.
//All requirements satisfied → answer = 2.
//
//✨ Example 2
//Input:
//
//Code
//list = [3, 2]
//s = "RGG"
//Output:
//
//Code
//0
//Explanation:
//
//First integer = 3 → skip 'R', then 'GG'. Only 2 'G' available → fail.
//Since one requirement failed, the entire process is invalid → answer = 0.
//
//🔒 Constraints
//1
//≤
//list.length
//≤
//10
//5
//
//1
//≤
//list
//[
//𝑖
//]
//≤
//10
//5
//
//String s consists only of characters 'R' and 'G'
//
//1
//≤
//∣
//𝑠
//∣
//≤
//10
//5
package Accenture;
import java.util.*;
public class GoodChocolate {
    static void main() {
        Scanner sc=new Scanner(System.in);
        List<Integer>  list=new ArrayList<>();
        while(sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        sc.nextLine();
        String s =sc.next();
        int count=0;
        int position=0;
        for(int i=0;i<list.size();i++){
            int r = list.get(i);
            while(position<s.length() && s.charAt(position)=='R'){
                position++;
            }
            int temp = position;
            int goodno=0;
            while(temp<s.length() && s.charAt(temp)=='G'){
                temp++;
                goodno++;
            }
            if(r<=goodno){
                count++;

            }else{
                break;
            }
            position+=r;
        }
        System.out.println(count);
    }
}
