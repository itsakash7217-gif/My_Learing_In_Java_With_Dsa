class Find {
    void search() {
        int[] no = {1, 5, 3};
        boolean found = false;// give found value is false
 int a=0;
        for (int i = 0; i < no.length; i++) {
            if (no[i] == 5) {
                found = true;
                a=i;
                break; // No need to keep searching once 5 is found
            }
        }

        if (found) {
            System.out.println(a);
        } else {
            System.out.println(-1);
        }
    }
}

public class question3search {
    public static void main(String[] args) {
        Find obj = new Find();
        obj.search();
    }
}