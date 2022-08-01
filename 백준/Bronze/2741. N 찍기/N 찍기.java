import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(n<=i){
                System.out.println(i++);
            }else{
                System.out.println(i);
            }
        }
    }
}