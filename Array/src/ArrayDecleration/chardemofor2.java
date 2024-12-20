package ArrayDecleration;

public class chardemofor2 {
public static void main(String[]args) {
	char arr[]= {'a','b','c'};
	for(int i=0;i < arr.length;i++) {
		System.out.println(arr[i]);
	}
	//for each loop
	for(char c:arr) {
		System.out.println(c);
	}
	
}
}
