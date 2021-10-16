class ArmStrongNumbers
{
	public static void main(String args[]){
	int arr[]={153,121, 253, 500};
	for(int i=0; i<arr.length; i++){

		int num=arr[i];
		int num2= num; 
		int sum=0;
		int multi=0;
	
		while(num!=0){
			int rem=num%10;
			multi=rem*rem*rem;
			sum= sum+multi;
			num=num/10;

		}
	
		System.out.println("Sum is " +sum);
		if(sum==num2)	{
			System.out.println("it is armstrong number");	
		}
		else{
			System.out.println("it is Not ArmStrong Number");
		}	
		
	}
	
	}//method
} // end class