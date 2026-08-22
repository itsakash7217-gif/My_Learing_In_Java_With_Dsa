package graph;
import java.util.*;
class pair implements Comparable<pair>{
    int node;
    int cost;
    pair(int node,int cost){
        this.node=node;
        this.cost=cost;
    }
    public int compareTo(pair pair){
        return this.cost - pair.cost;
    }
    public String toString(){
        return node + " " + cost;
    }
}
public class Dijkstra {
    static void main() {
        List<List<pair>> l = new ArrayList<>();
        for(int i = 0 ; i< 5;i++){
            l.add(new ArrayList<>());

        }
        l.get(0).add(new pair(1,30));
        l.get(0).add(new pair(4,5));
        l.get(1).add(new pair(0,30));
        l.get(1).add(new pair(2,4));
        l.get(2).add(new pair(1,4));
        l.get(2).add(new pair(3,7));
        l.get(2).add(new pair(4,8));
        l.get(3).add(new pair(2,7));
        l.get(3).add(new pair(4,6));
        l.get(3).add(new pair(0,2));
        l.get(4).add(new pair(3,6));
        l.get(4).add(new pair(2,8));
        l.get(4).add(new pair(0,5));
        int[] ans =new int[5];
        ans[0]=0;
        for(int i = 1 ; i< 5; i++){
            ans[i]=Integer.MAX_VALUE;
        }
        PriorityQueue<pair> pq = new PriorityQueue<pair>();
        pq.add(new pair(0,0));
        while(!pq.isEmpty()){
            pair s =pq.remove();
            for(pair a : l.get(s.node)){
                int lcost=a.cost+s.cost;
                if(lcost<ans[a.node]){
                    ans[a.node]=lcost;
                    pq.add(new pair(a.node,lcost));
                }
            }
        }
        System.out.print(Arrays.toString(ans));
    }
}
