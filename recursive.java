import java.util.*;
class recursive{
    public static int rec(int arr[],int coin,int max,int count,int me){
        while(coin!=0){
            if(coin>=max){
                coin=coin-max;
                count=count+1;
            }else{
                me=me-1;
                max=arr[me];
            }
            if(coin!=0){
                rec(arr,coin,max,count,me);
            }
        }

       return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        //int n=sc.nextInt();
        int arr[] =  {1,2,5};
    

       Arrays.sort(arr);

       
       int coin = sc.nextInt();
       int count=0;
       int me = arr.length-1;
       int max= arr[me];


       System.out.println(rec(arr,coin,max,count,me) );
    }
}
