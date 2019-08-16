import java.util.ArrayList; // new library imported

public class MyRSA {

    private static ArrayList<Integer> Narray;// new arraylist 
	private static ArrayList<Integer> change; // another arraylist 

	public static String encrypt(int p, int q, int privateKey, String message) {
        // to do
    int n = p * q; //find hcf
    int  f = 0; // loops
    System.out.println();
    Narray = new ArrayList<Integer>(); //initialise new arraylist
    for (f = 0; f < message.length(); f++) {
    	char s = message.charAt(f);
    	
    	int ascii = (int) s;
    	
    	Narray.add(ascii);
    	
    }
    PublicKey nkey = new PublicKey();
    int a = nkey.getKey(p, q, privateKey);
    
    StringBuilder sb = new StringBuilder();//stringbuilder used
    change = new ArrayList<Integer>();
    for (f=0; f < Narray.size(); f++) {
    	int encrypted = modular(Narray.get(f), a, n);
    	sb.append(encrypted + " ");
    	change.add(encrypted);
    }
    return sb.toString();
    	
    }
    
    public static String decrypt(int privateKey, String encryptedString, int p, int q) {
    // to do
    		System.out.println(); // line between the number for the string and the decrypted
    	 int n = p * q;
    	 int i = 0;
    	 StringBuilder sb1 = new StringBuilder();
    	 for (i =0; i< change.size(); i++){
    		 int decrypted = modular(change.get(i), privateKey, n);
    		 char decrypt = ((char) decrypted);
    		 sb1.append(decrypt);
    	 }

    	 
    	 return sb1.toString();
    		 
    	 }
    public static int modular(int al, int w, int mod){
    	int l =1;
    	for (int i=0; i < w; i++){
    		l = ((l * al) % mod);
    	}
    	return l;
    }
}