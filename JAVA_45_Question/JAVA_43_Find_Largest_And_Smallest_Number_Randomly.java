//Java program to find the largest and smallest numbers from random numbers

class JAVA_43_Find_Largest_And_Smallest_Number_Randomly{
	public static void main(String args[]){
		int n = (int)(Math.random()*10);
		int m = (int)(Math.random()*10);
		
		System.out.println("\n--------Largest and Smallest Numbers from Random Numbers--------");
		System.out.println("Before Vlaue : "+n);
		System.out.println("After Vlaue  : "+m);
		
		System.out.println();
		
		if(n<m){
			System.out.println(m+" is Largest Number from "+n);
		}else if(n>m){
			System.out.println(m+" is Smallest Number from "+n);
		}else{
			System.out.println("Both numbers are equal: " + n);
		}
		System.out.println("----------------");
	}
}