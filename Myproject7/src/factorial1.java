import java.util.Scanner;

public class factorial1 {
public static void main(String[] args){
	int largest,smallest,i,count;
	int[] inputarray = new int[50];
	Scanner in=new Scanner(System.in);
	System.out.println("enter the element");
	count=in.nextInt();
	System.out.println("Enter " + count + " elements");
    
    for(i = 0; i < count; i++) {
        inputarray[i] = in.nextInt();
    }
	largest=smallest=inputarray[0];
	for(i=1;i<=inputarray[i];i++){
		if(inputarray[i] > largest){
			largest= inputarray[i];
		}
        
    else if (inputarray[i] < smallest){
        smallest = inputarray[i];}
	}
	System.out.println(largest);
	System.out.println(smallest);
	
}
}
