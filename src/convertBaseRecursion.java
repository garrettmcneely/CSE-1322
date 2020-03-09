//Garrett McNeely


public class convertBaseRecursion {
	
	
	
	public static String convertBase(int num,int base){
	     
	     
	     if (num <=0)
	     {
	    	 return ""; 	 
	     }
	     
	     
	     else
	     {
	      return convertBase (num/base, base)+Character.forDigit(num%base,base); 
	     }
	     
	     
	}
	
	public static void main (String[] args)
	{
		System.out.println("753 in decimal is "+convertBase(753,8)+" in base 8");
		System.out.println("753 in decimal is "+convertBase(753,16)+" in base 16");
		System.out.println("9098 in decimal is "+convertBase(9098,20)+" in base 20");
		System.out.println("692 in decimal is "+convertBase(692,2)+" in base 2");
	}
	

}
