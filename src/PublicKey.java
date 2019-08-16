public class PublicKey {
    public int a;
    public int n;

    public static PublicKey create(int p, int q, int k) {
        // to do
	    PublicKey pub = new PublicKey();
	    return pub;
	}
	public int getKey(int p, int q, int k){
	   int n = p*q;
	   int x = (p-1)*(q-1);
	   int a = Euclidean.extendedAlgorithm(k, x);
	   return a;
	}
}