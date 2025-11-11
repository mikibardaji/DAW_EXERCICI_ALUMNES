public class funcionruleta2 {
    public static void main(String[] args) {
        pintarAsterisc(25);
    }
    public static void pintarAsterisc(int numero){
        final String AZUL = "\u001B[34m";
        final String RESET = "\u001B[0m";
        final String AMARILLO = "\u001B[33m";
        final String ROJO = "\u001B[31m";

        System.out.print("[");
        for(int i = 0; i < numero; i++){
            System.out.print(AZUL+"*" + RESET);
        }    
        System.out.println("]"+AMARILLO+ "--> " +ROJO+ numero + RESET);
    }

}
    
