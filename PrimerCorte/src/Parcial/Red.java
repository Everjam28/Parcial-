
package Parcial;

import java.util.Scanner;


public class Red {
    
    private String direccionIP;
    private String claseA;
    private String claseB;
    private String claseC;
    

   Scanner leer = new Scanner(System.in);
  public void details(){
       
        System.out.println("PC1,IP:192.168.0.1"+this.claseA);
        System.out.println("PC2,IP:192.168.0.3"+this.claseB);
        System.out.println("PC2,IP:192.168.1.2"+this.claseC);
  } 
  
  public boolean isLimitHost(){
      
      
      
      
      
        return true;
      
  }
}