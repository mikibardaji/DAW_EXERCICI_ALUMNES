import java.util.Scanner;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  copas; //iniciamos variables
       char carta2, carta3; 

        //preguntar cuantas copas
       
        System.out.println("Cuantas copas tienes?");
        copas = sc.nextLine().charAt(0);


int carta;

        //hacemos que eliga las dos cartas del ej 1 si tiene menos de 2000 copas
        if (copas<2000)
            //le preguntamos que carta quiere
                    {                       System.out.println("Eligue Mago Electrico(M) o Esbirro mega(E). ELIGUE UNA!!");

                        carta = sc.nextLine().charAt(0);

                        if (carta == 'M' || carta == 'm') //en caso que sea mago elec tendra que ser m o M
                        { System.out.println("Has escoguido el Mago electrico"); //damos el mennsaje de carta esocguida.
                        }
    
                        else if (carta == 'E' || carta == 'e') { //en caso que sea esbirro elec tendra que ser E o e
                         System.out.println("Has escoguido el Esbirro mega"); //damos el mennsaje de carta esocguida.
                        }
                      else  //damos mensaje de error en caso que pona otra cosa que no debe
                        { System.out.println("Valor incorrecto, M para Mago electrico o E para esbirro mega");
            
                        }
        }else if (copas>=2000 && copas<3000) { //se aplican estos codigos en caso que tenga entre 2000 y 3000 copas
                    //damos mensje de eleguir
                         System.out.println("Eligue Cavallero(C) o Bandida(B)");
                         carta2 = sc.nextLine().charAt(0);
                         
                    } else if (carta2 == 'C' || carta2 == 'c'){   //en caso que sea cavallero tendra que ser C o c
                         System.out.println("Has escoguido el Cavallero"); //damos el mennsaje de carta esocguida.
                    }
                          else if (carta2 == 'B' || carta2 == 'b') {  //en caso que sea bandida tendra que ser B o b
                         System.out.println("Has escoguido la Bandida"); //damos el mennsaje de carta esocguida.
                          }

                         
                      else  //damos mensaje de error en caso que pona otra cosa que no debe
                        { System.out.println("Valor incorrecto, C para Cavallero o B para bamdida");
                        
        } 
        
        else if (copas>=3000) { //se aplican estos codigos en caso que tenga mas de 3000 copas
                    //damos mensje de eleguir
                         System.out.println("Eligue (E)Ejercito de esqueletos o el (G)Gigante"); 
                         carta2 = sc.nextLine().charAt(0);
                         
                    } else if (carta3 == 'E' || carta2 == 'e'){   //en caso que sea Ejercito de esqueletos tendra que ser E o e
                         System.out.println("Has escoguido el ejercito de esqueletos"); //damos el mennsaje de carta esocguida.
                    }
                          else if (carta3 == 'G' || carta2 == 'g') {  //en caso que sea gigante tendra que ser G o g
                         System.out.println("Has escoguido la gigante"); //damos el mennsaje de carta esocguida.
                          }
                      else  //damos mensaje de error en caso que pona otra cosa que no debe
                        { System.out.println("Valor incorrecto, E ejercito de esqueletos o G para el gigante");  
                        }
    
            
           
    }
}
