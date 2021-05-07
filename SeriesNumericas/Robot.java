public class Robot
{
    public void ejercicio1(int n){
        int num = 1;
        int contador = 0;
        if(n == 1){
           System.out.print(1);
        }else if(n > 0){
           System.out.print(1 + " ");
               for(int i = 2 ; i <= n ; i++){
                contador++;
               if(contador == 4){
                  contador = 2;
                  num = num + contador;
                  System.out.print(num + " ");
                  contador = 0;
               }else{
                  num = num + contador;
                  System.out.print(num + " ");
               
               }
           }
        }
    }
    
    public void ejercicio2(int n){
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int num4 = 0;
        if(n <= 3 && n > 0){
            for(int i = 1; i <= n; i++){
                System.out.print(1 + " ");
            }
        }else if(n > 0){
            for(int i = 1; i <= 3; i++){
                System.out.print(1 + " ");
            }
            for(int i = 4; i <= n; i++){
                num4 = num1 + num2;
                System.out.print(num4 + " ");
                num1 = num2;
                num2 = num3;
                num3 = num4;           
            }
        }
    }
}
