//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean ispal(int x){
        int res=0,r,temp;
        temp=x;
        while(x>0){
            r=x%10;
            res=(res*10)+r;
            x=x/10;
        }
        if(res==temp)
        return true;
        
        return false;
    }
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int c=0;
                  for(int i=0;i<n;i++){
                      if(ispal(a[i])){
                          c++;
                      }
                  }
                  if(c==a.length)
                  return 1;
                  
            return 0;
           }
}