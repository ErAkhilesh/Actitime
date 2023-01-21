package TYSS;

public class FindTheSmallValue {
	public static void main(String[] args) {
		int n[]= {4,5,6,7,8,9};
		int small= n[0];
		
		for(int i=0;i<n.length;i++)
		{	
			if(n[i]<small)
			{
				small=n[i];
				
			}
		}
		System.out.println(small);
		
	}

}
