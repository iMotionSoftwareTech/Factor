//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Factor {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        for (long i = 2; i <= n / i; i++) {
            while (n % i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 1) System.out.println(n);
        else System.out.println();
    }
}