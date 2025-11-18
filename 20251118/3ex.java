public class 1ex {
    public static void main(String[] args) throws Exception {
        
    }

    public static boolean hay_gol(String tirador, String portero) {
        if (!tirador.equals(portero)) {
            System.out.println("GOOOL!");
            return true;
        } else {
            System.out.println("Paradón!");
            return false;
        }
    }
}