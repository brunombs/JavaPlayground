public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = sc.nextInt();
    System.out.println("Multiplication table of the number: " + number);
    for (int i = 1; i <= 10; i++) {
        System.out.println(number + " * " + i + " = " + number * i);
    }
}
