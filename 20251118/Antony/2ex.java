import java.util.Random;
public class 1ex {
    public static void main(String[] args) throws Exception {
        
    }

        public static String elegir_lado_maquina() {
            Random r = new Random();
            String[] lados = {"Left", "Right", "Center"};
            return lados[r.nextInt(3)];
    }
}


