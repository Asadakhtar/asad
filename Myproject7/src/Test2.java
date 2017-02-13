import java.util.Scanner;

class Test2 {
public static void main(String[] args){
	int largest,smallest,count,i;
	int[] inputArray=new int[20];
	Scanner in=new Scanner(System.in);
	System.out.println("enter the no of elements");
	count=in.nextInt();
	System.out.println("enter   "+count+"  elements");
	
	for(i=0;i<count;i++){
		inputArray[i]=in.nextInt();
	}
	largest=smallest=inputArray[0];
	for(i=1;i<count;i++){
		if(inputArray[i]>largest){
			largest=inputArray[i];
		}
		else if(inputArray[i]<smallest){
			smallest=inputArray[i];
	}
	
}
	System.out.println(largest);
	System.out.println(smallest);
	
}	
}	



