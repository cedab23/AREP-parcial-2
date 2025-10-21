
package arep.parcial.mathServices;


public class mathFactor {
    
    private int[] list; 
    
    public int[] factor(int number){
    int i=1;    
     while(i<=number){
         if((number%i)==0){
             //list.add(i);
         }
         i++;
     }
     
     return list;
    
}
}
