import java.util.Random;
public class 1ex {
    public static void main(String[] args) throws Exception {
        
    }

    public static boolean shay_que_seguir_tirandoeguir(int gj, int gm, int tanda) {
        if (tanda >= 5) return false;
        int diff = Math.abs(gj - gm);
        int rest = 5 - tanda;
        return diff <= rest;
    }
}
