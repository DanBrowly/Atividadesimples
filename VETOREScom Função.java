public class MyClass {
    public static void main(String args[]) {
        
    
    int [] PA = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 ,18 ,19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27 ,28 ,29 ,30 ,30 };
     int numero = 0;
     
     
     for(int i=0; i<30; i++){
         numero = numero + PA[i];
     }
     
     System.out.println(imprime() + soma(PA, numero));
    
    }
    public static int soma(int [] PA, int numero){
        return (PA + numero);
    
        
    }
     
     public static String imprime(){
        return "soma da PA é ";
     }
}
