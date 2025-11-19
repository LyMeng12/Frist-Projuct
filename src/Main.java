import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int a;
    int b ;
    int sum;
    public Main(int a,int b  ) {
        this.a = a;
        this.b =b;
        this.sum = b + a ;
    }
    public void Print(){
        System.out.println("Sum(a+b):"+sum);
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Inter a:");
        int k = sc.nextInt();

        System.out.print("Inter b:");
        int a = sc.nextInt();

        Main name = new Main(k,a);
        name.Print();
    }
}