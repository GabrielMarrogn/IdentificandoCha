import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int cont = 0;
        sc.close();

        if(a == t){
            cont++;
        }if(b == t){
            cont++;
        }if(c == t){
            cont++;
        }if(d == t){
            cont++;
        }if(e == t){
            cont++;
        }

        System.out.println(cont);
        
    }
}
