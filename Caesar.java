//import java.io.*;
//import java.util.*;


public class Caesar {
	public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
	
	public static String encrypt(String text, int shift) {
		String cipher = ""
		if (shift > 26){
			shift = shift % 26
		}
		// TODO Auto-generated constructor stub
		else if (shift < 0){

		}
		int length = text.length();
		for (int i = 0, i < length, i++){
			char x = text.charAt(i);
			if (Character.isLetter(x));

		}else{
			cipher += x;
		}
		return Cipher
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		String message = new String();
		
	}

}