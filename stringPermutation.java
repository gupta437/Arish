package project;

public class stringPermutation{
	public static void main(String[] args){
		String input1 = "abc";
		String input2 = "bcd";
		boolean found = permutation(input1,input2);
		System.out.println("Is "+input1 +" permutation of  "+input2+" "+found);
	}


	public static boolean permutation(String input1, String input2){
		if(input1.length()!=input2.length()){
			return false;
		}

		int[] letters = new int[128];
		for(int i =0; i<input1.length();i++){
			letters[input1.charAt(i)]++;
		}
		for(int i=0;i<input2.length();i++){
			letters[input2.charAt(i)]--;
			if(letters[input2.charAt(i)]<0){
				return false;
			}
		}
		return true;
	}
}