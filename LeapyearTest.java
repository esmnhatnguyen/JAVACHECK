import java.util.Scanner;
public class LeapyearTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("임의의 연도 입력하세요 : ");
            int year= sc.nextInt();
            if(year % 400== 0|| (year % 4== 0&& year % 100!= 0)) {
                System.out.printf("%d-> 윤년%n", year);
} else{
                System.out.printf("%d-> 평년%n", year);
}
            System.out.print("종료하려면 키보드에서 Q 키를, 계속하려면 C 키를 누르시오.....");
            char signal=Character.toUpperCase(sc.next().charAt(0));
            if(signal == 'Q') {
                System.out.println("프로그램을 종료합니다");
                break;
} else if(signal != 'C') {
                continue;
}
}
        sc.close();
}
}
