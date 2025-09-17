public class SweetEncryptor {
    public static void main(String[] args) {
        Crypt crypt = new Crypt("Hello, World!");
        System.out.println("Original Text: Hello, World!");
        System.out.println("Generated Key: " + crypt.getKey());
    }
}
