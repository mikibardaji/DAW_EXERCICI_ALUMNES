public class funcionruleta2 {
    public static void main(String[] args) {
        pintarAsterisc(25);
    }
    public static void pintarAsterisc(int numero){
        System.out.print("[");
        for(int i = 0; i < numero; i++){
            System.out.print("*");
        }    
        System.out.println("]"+ "--> " + numero);
    }

}
    
