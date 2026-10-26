public static void main(String[] args) {
  for(int start=2; start <= 9; start++) {
  System.out.printf("%-9s", start + "단");
}
  System.out.println();
  for(int i=1; i <= 9; i++) {
    for(int dan=2; dan <=9; dan++) {
      System.out.printf("%-10s", dan + "*"+ i + "="+ (dan * i));
}
    System.out.println();
}
}
