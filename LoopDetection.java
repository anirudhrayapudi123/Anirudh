import java.util.*;
class Vertex{
    public boolean detectsCycle(List<List<Integer>> bl){
        boolean[] arr=new boolean[bl.size()+1];
        Stack<Integer> l=new Stack<>();
        l.add(bl.get(0).get(0));
        while(!l.isEmpty()){
            int r=l.pop();
            arr[r]=true;
            for(int i=0;i<bl.get(r).size();i++)
            {
            if(arr[bl.get(r).get(i)]==true){
                return true;
            }
            else{
                l.push(bl.get(r).get(i));
                arr[bl.get(r).get(i)]=true;
            }
            }
        }
        return false;
    }
}
public class LoopDetection{
    public static void main(String[] args){
        Vertex v=new Vertex();
        List<List<Integer>> bl=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(3);
        bl.add(l);
        l=new ArrayList<>();
        l.add(4);
        l.add(5);
        bl.add(l);
        l=new ArrayList<>();
        l.add(5);
        bl.add(l);
        l=new ArrayList<>();
        l.add(6);
        bl.add(l);
        l=new ArrayList<>();
        l.add(6);
        bl.add(l);
        l=new ArrayList<>();
        
        bl.add(l);
        //System.out.println(bl);

        if(v.detectsCycle(bl)){
            System.out.println("cycle found");
        }
        else{
            System.out.println("No cycle found");

        }
    }
}