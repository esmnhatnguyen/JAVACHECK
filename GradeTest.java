import java.util.Scanner;

public class GradeTest {
  static double check(double score, Scanner sc) {
    while (score < 0 || score > 100) {
      System.out.print("다시 입력하시오 (0~100) ==>");
      score = sc.nextDouble();
    }
    return score;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("수험자의 이름을 입력하시오.  ==>");
    String name = sc.next();

    System.out.print("국어점수를 입력하시오.  ==>");
    double kor_score = check(sc.nextDouble(), sc);

    System.out.print("영어점수를 입력하시오.  ==>");
    double eng_score = check(sc.nextDouble(), sc);

    System.out.print("수학점수를 입력하시오.  ==>");
    double math_score = check(sc.nextDouble(), sc);

    System.out.println("==================================");

    int total_score = (int)(kor_score + math_score + eng_score);
    double average_score = (double)total_score / 3.0;

    if (average_score >= 95) {
      System.out.printf("%s 씨는 총점 %d, 평균 %.3f으로 성적은 A+입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }
    if (average_score >= 90) {
      System.out.printf("%s 씨는 총점 %d, 평균 %.3f으로 성적은 A0입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }
    if (average_score >= 85) {
      System.out.printf("%s 씨 là 총점 %d, 평균 %.3f으로 성적은 B+입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }
    if (average_score >= 80) {
      System.out.printf("%s 씨는 총점 %d, 평균 %.3f으로 성적은 B0입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }
    if (average_score >= 75) {
      System.out.printf("%s 씨는 총점 %d, 평균 %.3f으로 성적은 C+입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }
    if (average_score >= 70) {
      System.out.printf("%s 씨는 총점 %d, 평균 %.3f으로 성적은 C0입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }
    if (average_score >= 65) {
      System.out.printf("%s 씨는 총점 %d, 평균 %.3f으로 성적은 D+입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }
    if (average_score >= 60) {
      System.out.printf("%s 씨는 총점 %d, 평균 %.3f으로 성적은 D0입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }
    if (average_score < 60) {
      System.out.printf("%s 씨는 총점 %d, 평균 %.3f으로 성적은 F입니다.%n", name, total_score, average_score);
      sc.close();
      return;
    }

    sc.close();
  }
}
