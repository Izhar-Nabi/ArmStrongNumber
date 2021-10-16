class ArmStrongNumbersSingle
{
	public static void main(String args[]){
	int num=153;
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

			
	}//method
} // end class