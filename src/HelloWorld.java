import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);
		System.out.print("enter the word");
		String word = sc.next();
		System.out.print("enter the letter");
		char letter = sc.next().charAt(0);

		int count = 0;
		int len = word.length();
		for(int i =0;i<len;i++){
			if(word.charAt(i) == letter){
				count++;
			}
		}
		System.out.print(count);
	}

}
