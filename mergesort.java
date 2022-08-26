import java.util.*;


public class mergesort{
	public static boolean call (int[] leftarr,int[] arr,int mergesort_count,int[] rightarr,ArrayList<Integer> lli,ArrayList<Integer> rli){
		if(mergesort_count>1){
			return false;
		}
		int sublefarr_len= leftarr.length/2;

		int sublefarr[] = new int[sublefarr_len];
		int subrigarr[] = new int[leftarr.length-sublefarr_len];
		//System.out.println(subrigarr.length);

		for(int i=0;i<sublefarr.length;i++){
			sublefarr[i]=leftarr[i];
			
		}
		System.out.println(Arrays.toString(sublefarr));
		lli.add(sublefarr[0]);

		int countl=0;
		for(int i=sublefarr_len;i<=subrigarr.length;i++){
			subrigarr[countl]=leftarr[i];
			
			countl++;
			
		}
		//System.out.println("sub right array" + Arrays.toString(subrigarr));
		for(int i=0;i<arr.length/2;i++){
		}

		int sublefarr2_len= sublefarr.length%2;
		

		int[] sublefarr2= new int[sublefarr2_len];
		int[] subrigarr2= new int[sublefarr2_len];
		for(int i=0;i<sublefarr2_len;i++){
			sublefarr2[i]=subrigarr[i];
		}
		System.out.println(Arrays.toString(sublefarr2));
		//lli.add(sublefarr2[0]);

		for(int i=sublefarr2_len;i<=sublefarr2_len;i++){

			subrigarr2[0]=subrigarr[i];
		}
		;
		//lli.add(subrigarr2[0]);
		if(subrigarr2[0]>sublefarr2[0]){
			lli.add(sublefarr2[0]);
			lli.add(subrigarr2[0]);
		}
		else{
			lli.add(subrigarr2[0]);
			lli.add(sublefarr2[0]);
		}
		System.out.println(Arrays.toString(subrigarr2));
		mergesort_count++;
		call(rightarr,arr,mergesort_count,rightarr,rli,rli);
        return true;
	 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,3,5,2,4,6};
		int mid = arr.length/2 ;
		ArrayList<Integer> lli = new ArrayList<>();
		ArrayList<Integer>  rli = new ArrayList<>();
		ArrayList<Integer>  ali = new ArrayList<>();

		int[] leftarr = new int[mid];
		int[] rightarr= new int[mid];
		for(int i=0;i<mid;i++){
			leftarr[i]=arr[i];
		}
		System.out.println(Arrays.toString(leftarr));
		int count=0;                                 
		for(int i=mid;i<arr.length;i++){
			rightarr[count]=arr[i];
			count++;
		}
		int mergesort_count=0;
		if(call(leftarr,arr,mergesort_count,rightarr,lli,rli)== true){

		}
		System.out.println(lli);
		System.out.println(rli);
		for(int i=0;i<lli.size();i++){
			for(int j=0;j<rli.size();i++){
				
				while(ali.size()!=5){

				
					if(lli.get(i)<rli.get(j)){
						ali.add(lli.get(i));
						//lli.remove(i);
						//lli.remove(lli.get(i));
						i++;
						if(lli.size()==i){
							ali.add(rli.get(lli.size()-1));
							break;
						}
					}
					else{
						ali.add(rli.get(j));
						//rli.remove(j);
						//lli.remove(lli.get(j));
						j++;
						if(lli.size()==j){
							ali.add(lli.get(rli.size()-1));
							break;
						}
					}
					
				}
				break;
			}
			// if(lli.isEmpty()){
			// 	ali.add(rli.get(lli.size()-1));
			// }else{
			// 	ali.add(lli.get(rli.size()-1));
			// }

		}
		System.out.println(ali);
		//System.out.println(Arrays.toString(rightarr));


		
	}
	
}