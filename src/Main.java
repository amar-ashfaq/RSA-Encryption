public class Main {
    public static void main(String[] args) {
        int p = 53;
        int q = 61;
        int k = 1013;
        String message = "Hello World!";
        System.out.println("Message to encrypt: " + message);
        String encryptedString = MyRSA.encrypt(p, q, k, message);
        System.out.println("Encrypted string: " + encryptedString);
        String checkValue = MyRSA.decrypt(k, encryptedString, p, q);
        System.out.println("String after decrypting: " + checkValue);
    }
}