import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        n=input.nextInt();
        System.out.println("4'un kuvvetleri");
        for (int i=1; i<=n; i*=4)
        {System.out.println(i);
        }
        System.out.println("5'in kuvvetleri");
        for (int b=1; b<=n; b*=5)
        {System.out.println(b);
        }

    }
}
