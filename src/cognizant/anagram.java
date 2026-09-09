package cognizant;

public class anagram {
        public static void main(String[] args) {
            String s  ="listen";
            String c = "silen";
            boolean check=false;
            for(int i = 0 ; i< s.length(); i++){
                char t = s.charAt(i);
                boolean flag = false;
                for(int j = 0 ; j < c.length() ; j++){
                    if(t==c.charAt(j)) flag=true;
                }
                if(!flag){
                    check = true;
                    System.out.print("not anagram");
                    break;
                }
            }
            if(!check) System.out.print("this is anagram");
        }

}
