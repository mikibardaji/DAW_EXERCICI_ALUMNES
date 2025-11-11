import java.util.Scanner;

public class apostaPunts {
    public static void main(String[] args) throws Exception {
        apostaPunts(0, 0);
    }
        public static int apostaPunts(int saldo, int puntsAposta){
        if (saldo < puntsAposta){
            return -1;
        }
        else{
            return puntsAposta;
        }

        }
    }



