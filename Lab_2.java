import java.util.Scanner;


/*class Fahrenheit_ne_Celsius {
    public static void main(String[] args) {
      float temperature;
      Scanner to = new Scanner(System.in);
  
      System.out.println("Shkruani temperaturen ne  Fahrenheit");
      temperature = to.nextInt();
      to.close();
  
      temperature = ((temperature - 32)*5)/9;
  
      System.out.println("Temperatura ne Celsius = " + String.format("%.02f", temperature));
    }
  }
 */
      
public class Lab_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Shkruaj vleren qe do marresh:  ");
        double hua = console.nextDouble();
        System.out.print("Shkruani kohen  ne vite: ");
        int vitet = console.nextInt();
        System.out.print("Shkruani normen e interesit:");
        double interesi = console.nextDouble();
        System.out.println();
        int n = 12 * vitet;
        double c = interesi / 12.0 / 100.0;
        double PagesaMujore = hua * c * Math.pow(1 + c, n) /
                         (Math.pow(1 + c, n) - 1);
        System.out.println("Pagesa Mujore = lek " +  String.format("%.02f", PagesaMujore));
    }
}