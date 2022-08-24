import java.util.*;
public class greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int sum=8;
        int count=0;
        String s = sc.nextLine();
        int n = sc.nextInt();
        String[] arr= s.split(" ");
        int[] aiarr= new int[arr.length];
        int[] iarr= new int[arr.length];

        for(int i=0;i<aiarr.length;i++){
            aiarr[i]=Integer.parseInt(arr[i]);
        }

        Arrays.sort(aiarr);
        System.out.println(Arrays.toString(aiarr));


        //int it=0;
        // for(int i=arr.length-1;i>=0;i--){
        //     iarr[i]=Integer.parseInt(arr[it]);
        //     it=it+1;
        // }

        //System.out.println(Arrays.toString(iarr));
        int in=aiarr.length-1;
        // System.out.println();
        int max=aiarr[in];
        System.out.println("max"+ max);
        while(n!=0){
            if(n>=max){
                n=n-max;
                //System.out.println("sum"+sum);
                count=count+1;
                System.out.println("count"+count);
               
            }
            else{
                in=in-1;
                max=aiarr[in];
                //System.out.println("next max"+iarr[in]);
            }
            
        }
        System.out.println("count"+count);
        
     }
}
