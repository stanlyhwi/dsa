import java.util.*;
public class four
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] st=s.split(" ");
		int ch=0;
		int ck=0;
		for(int i=0;i<st.length;i++){
		   
		    if(!(st[i].equals("0"))){
                ch++;
		    }
		  
		    if(ch%4==0 || ch%10==4){
		        if(!(st[i].equals("0"))){
		        ck++;
		        }
		        st[i]="0";
		        
		      

		    }
		    if(i==st.length-1){
		        i=-1;
		    }  
		    if(ck==st.length-1){
		        for(int j=0;j<st.length;j++){
		            if(!(st[j].equals("0"))){
		                System.out.print(st[j]);
                        break ;
		            }

		        }
		        System.out.println(Arrays.toString(st));
		        break;
		    }
		    
		    
		}
	}
}
