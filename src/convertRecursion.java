
public class convertRecursion {
	
	public static void convertBinary(int num,int base){
	     char array[] = new char[100];
	     int z = 0;
	     
	     
	     while(num > 0){
	       int x = num%base;
	       char c=Character.forDigit(x,base); 
	       array[z++] = c;
	       num = num/base;
	     }
	  
	   
	     
	     
	     
	     for(int y = z-1;y >= 0;y--){
	       System.out.print(array[y]);
	     }
	  }
	
	
	
	
	public static void main(String[] args)
	{
		
		 convertBinary(753,8);
		 System.out.println();
		 System.out.println();
		 convertBinary(753,16);
		 System.out.println();
		 System.out.println();
		 convertBinary(692,2);
		 System.out.println();
		 System.out.println();
		 convertBinary(9098,20);
		
		
	}
	

}
