package project;

import java.util.Comparator;

class MyCustomeComparator implements Comparator
{

	@Override
	public int compare(Object s1, Object s2) {
		String one = (String)s1;
        String two = (String)s2;
        int one1 = decode(one);
        int two2 = decode(two);
        /* for ascending order */
        if(one1>two2){
            return 1;
        }else{
            return -1;
        }
}
	
private static int decodeSingle(char letter) {
	switch(letter) {
		case 'M': return 1000;
		case 'D': return 500;
		case 'C': return 100;
		case 'L': return 50;
		case 'X': return 10;
		case 'V': return 5;
		case 'I': return 1;
		default: return 0;
	}
}
public static int decode(String roman) {
	int result = 0;
	String uRoman = roman.toUpperCase(); //case-insensitive
	for(int i = 0;i < uRoman.length() - 1;i++) {//loop over all but the last character
		//if this character has a lower value than the next character
		if (decodeSingle(uRoman.charAt(i)) < decodeSingle(uRoman.charAt(i+1))) {
			//subtract it
			result -= decodeSingle(uRoman.charAt(i));
		} else {
			//add it
			result += decodeSingle(uRoman.charAt(i));
		}
	}
	//decode the last character, which is always added
	result += decodeSingle(uRoman.charAt(uRoman.length()-1));
	return result;
}
}