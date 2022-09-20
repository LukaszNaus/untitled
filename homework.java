import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        System.out.println("Podaj imie");
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        System.out.println("podaj nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj wiek");


        int x = scanner.nextInt();
       if (x>17){
           System.out.println(imie  + nazwisko +" Mozesz wejsc");
       }else {
           System.out.println(imie  + nazwisko + " Nie Mozesz wejsc");
       }
    }


}
