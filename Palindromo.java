import java.util.Scanner;

public class Palindromo
{
    public static void main()
    {
        System.out.print('\u000c');
        String palabra;
        Scanner leer = new Scanner(System.in);
        int index_right, index_left,salir=1;
        boolean stop = false;
       
      do{
         System.out.println("Escribe una palabra: ");
         palabra = leer.next();
         index_left = 0;
         index_right = palabra.length() - 1;
        
        while ((index_left < index_right) && (!stop))
        {
             if (palabra.charAt(index_left) == palabra.charAt(index_left))
         {
            index_left++;
            index_right--;
        }
        else
        { 
            stop = true;
        }
        
      }
      if (!stop)
      {
          System.out.println(palabra + " es palindromo.");
        }
        else
        {
             System.out.println(palabra + " no es palindromo.");
        }
         System.out.println("Para salir presione=> 0");
         System.out.println("Para continuar presione=> 1");
         System.out.println("Desea continuar?");
         salir = leer.nextInt();
          
          
      if(salir == 0)
          {
              System.out.println("Terminando...");
              System.exit(0);
           }
     }
     while(salir == 1);
    }
}
