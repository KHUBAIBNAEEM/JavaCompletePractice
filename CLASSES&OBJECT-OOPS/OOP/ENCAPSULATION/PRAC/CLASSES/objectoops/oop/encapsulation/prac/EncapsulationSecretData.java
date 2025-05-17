class SecretData {
    private String data;

    public SecretData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class EncapsulationSecretData {
    public static void main(String[] args) {
        SecretData secret = new SecretData("Khubaib");
        System.out.println(secret.getData());
    }
}
