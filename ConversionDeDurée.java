import java.util.Scanner;

public class ConversionDeDurée {
    public static void main(String[] args){
        Scanner sc = new Scannner(System.in);
        System.out.println("Entrer le nombre de seconde:");
       
        int secondes = sc.nextInt();

        int heures = seconde / 3600;
        int minutes = reste / 60 ;
        int reste = seconde / 3600 ;
        seconde=reste % 60 ;
        System.out.println(heures + "h" + minutes +"m" + secondes + "s");

    }
}
 