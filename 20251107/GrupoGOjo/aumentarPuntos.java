public class aumentarPuntos {
    public static void main(String[] args) {
        int punto = 0;
        punto = aumentarPunto(punto);
        System.out.println(punto);
    }

    public static int aumentarPunto(int point) {
        point++;
        return point;
    }
}
