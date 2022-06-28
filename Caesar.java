import java.util.Scanner;

//import java.io.*;
//import java.util.*;


public class Caesar {
	public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
	
	public static String encrypt(String text, int shift) {
		String Cipher = "";
		if (shift > 26){
			shift = shift % 26;
		}
		// TODO Auto-generated constructor stub
		else if (shift < 0){

		}
		int length = text.length();
		for (int i = 0; i < length; i++){
			char x = text.charAt(i);
			if (Character.isLetter(x));
				if (Character.isLowerCase(x)){
					char shifted_x = (char)(x + shift);
					if (shifted_x>'z'){
						Cipher += (char)(x - (26 - shift));
					}
					else{
						Cipher += shifted_x;
					}
				}
				else if (Character.isUpperCase(x)){
					char shifted_x = (char)(x + shift);
					if (shifted_x>'Z'){
						Cipher += (char)(x - (26 - shift));
					}
					else{
						Cipher += shifted_x;
					}
				}else{
			
			Cipher += x;
			}
		}
		return Cipher;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		String message = new String();
		
	}

}