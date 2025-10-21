
package arep.parcial.mathServices;



//metodo encargado de las operaciones asociadas a numeros primos
public class mathPrime {
    
    private int[] list; 
    
    public int[] prime(int number){
    int i=1;    
    int j=1;
    int count=0;
     while(i<=number){
         count=0;
         while(j<=i){
             if((j%i)==0){
             count++;
             }
             j++;
         }
         if(count>2){
         }else{
         //list.add(i);
         }
         i++;
     }
    
    return list;
    }
    
}
