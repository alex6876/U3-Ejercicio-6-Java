public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Axel Rodriguez", "Axel@gmail.com", "A48635425");

        Usuario u2 = new Usuario("Juan Olivar", "Juan@gmail.com", "abc1234");

        System.out.println("--- Usuario 1 ---");

        u1.cambiarPassword("A48635425", "A");
        u1.validarCredenciales("A");

        System.out.println("--- Usuario 2 ---");

        u2.cambiarPassword("A48635425", "B");
        u2.validarCredenciales("B");
    }
}