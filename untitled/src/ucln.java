import java.util.Scanner;
public class ucln {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap a:");
        int a = scanner.nextInt();
        System.out.println(" nhap b");
        int b = scanner.nextInt();
        int ucln =0 ;
        if (a == 0 || b ==0){
            System.out.println("khong duoc nhap so 0");
        }
        else if (a > b){
            for (int i = 2; i <= b; i++){
                if (a % i == 0 && b % i == 0){
                    ucln = i;
                }
            }
        }
        else {
            for (int j = 2; j <= a; j++){
                if (a % j == 0 && b % j == 0){
                    ucln = j;
                }
            }
        }
        System.out.println(" UCLN la: "  + ucln );

    }
}
