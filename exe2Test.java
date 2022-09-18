public class exe2Test {
    public static void main(String[] args) {
        exe2 test=new exe2();
        System.out.println(test.getbalance());
        test.deposit(500);
        System.out.println(test.getbalance());

        test.withdraw(300);
        System.out.println(test.getbalance());

    }
}
