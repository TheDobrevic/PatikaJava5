import java.util.Scanner;
public class Index {
    public static void main (String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Kilonuzu girin:");
        kilo = input.nextDouble();
        
        System.out.print("Boyunuzu girin (CM):");
        boy = input.nextDouble();
        
        boykaresi=boy*boy ;
        index= kilo/boykaresi;

        System.out.print("Kilo indeksiniz:" + index+ ");
    }
}
