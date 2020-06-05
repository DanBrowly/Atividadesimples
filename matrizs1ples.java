public class MyClass {
    public static void main(String args[]) {
      
      double [][] numeral = new double[12][12];
      
      numeral [5] [0] = 5;
      numeral [S] [1] = 5;
      numeral [5] [2] = 1.0;
      numeral [5] [3] = -3.5;
      numeral [5] [4] = 2.5;
      numeral [5] [5] = 4.1;
      
      for ( int i=0; i<numeral.length; i++){
          for(int j=0; j<numeral[i].length; j++){
          
          System.out.println(numeral[i][j]+ " ");
          }
      }
    System.out.println();
        
    }
    
}
