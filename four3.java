import java.util.*;
public class four3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> li = new ArrayList<>();
        for(int i=0;i<11;i++){
            li.add(sc.next());
        }
        int count=0;
        for(int i=0;i<li.size();i++){
            count=count+1;
            if(count%4==0 || count%10==4){
                li.remove(i);
                System.out.println(count);
                i=i-1;
                System.out.println(li);

            }
            if(i==li.size()-1){
                i=-1;
            }
            System.out.println(li);
        }

    }
}
