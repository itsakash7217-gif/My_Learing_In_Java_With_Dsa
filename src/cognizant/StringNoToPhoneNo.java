package cognizant;

import java.util.*;

public class StringNoToPhoneNo {
    static void main() {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        String[] num = s.split(" ");
        HashMap<String,Integer> h = new HashMap<>();
        h.put("zero",0);
        h.put("one",1);
        h.put("two",2);
        h.put("three",3);
        h.put("four",4);
        h.put("five",5);
        h.put("six",6);
        h.put("seven",7);
        h.put("eight",8);
        h.put("nine",9);
        Long phoneno=0L;
        int i = 0;
        while(i<num.length){
            if(num[i].equals("double")){
                phoneno*=100;
                int x = h.get(num[++i]);
                phoneno+=(x*10+x);
            }else if(num[i].equals("triple")){
                phoneno*=1000;
                int x = h.get(num[++i]);
                phoneno+=(x*100+x*10+x);
            }else{
                phoneno=phoneno*10+h.get(num[i]);
            }
            i++;
        }

        System.out.println(Long.toString(phoneno));
    }
}
