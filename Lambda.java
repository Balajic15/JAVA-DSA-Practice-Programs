import java.lang.Math;
import java.util.Scanner;

@FunctionalInterface
interface SimpleOperations {
    double operation(double a, double b);
}

@FunctionalInterface
interface AdvancedOperations {
    double apply(double a);
}

class Lambda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        SimpleOperations add = (a, b) -> a + b;
        SimpleOperations sub = (a, b) -> a - b;
        SimpleOperations mul = (a, b) -> a * b;
        SimpleOperations div = (a, b) -> a / b;
        SimpleOperations mod = (a, b) -> a % b;
        SimpleOperations power = (a, b) -> Math.pow(a, b);

        AdvancedOperations square = a -> a * a;
        AdvancedOperations cube = a -> a * a * a;
        AdvancedOperations sroot = a -> Math.sqrt(a);
        AdvancedOperations croot = a -> Math.cbrt(a);
        AdvancedOperations sinop = a -> Math.sin(a);
        AdvancedOperations cosop = a -> Math.cos(a);
        AdvancedOperations tanop = a -> Math.tan(a);
        AdvancedOperations secop = a -> 1 / Math.cos(a);
        AdvancedOperations cosecop = a -> 1 / Math.sin(a);
        AdvancedOperations cotop = a -> 1 / Math.tan(a);
        AdvancedOperations arcsin = a -> Math.asin(a);
        AdvancedOperations arccos = a -> Math.acos(a);
        AdvancedOperations arctan = a -> Math.atan(a);
        AdvancedOperations logop = a -> Math.log(a);
        AdvancedOperations log10base = a -> Math.log10(a);
        AdvancedOperations expop = a -> Math.exp(a);
        AdvancedOperations absvalue = a -> Math.abs(a);
        AdvancedOperations toRadiansop = a -> Math.toRadians(a);
        AdvancedOperations toDegreeop = a -> Math.toDegrees(a);
        AdvancedOperations percentage = a -> a / 100;
        AdvancedOperations reciprocal = a -> 1 / a;
        AdvancedOperations negate = a -> -a;
        AdvancedOperations factorial = a -> {
            int n = (int) a;
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println(add.operation(2, 3));
        System.out.println(sub.operation(4, 3));
        System.out.println(mul.operation(3, 3));
        System.out.println(div.operation(4, 4));
        System.out.println(mod.operation(3, 3));
        System.out.println(power.operation(2, 2));
        System.out.println(square.apply(3));
        System.out.println(cube.apply(2));
        System.out.println(sroot.apply(2));
        System.out.println(croot.apply(2));
        System.out.println(sinop.apply(2));
        System.out.println(cosop.apply(2));
        System.out.println(tanop.apply(2));
        System.out.println(secop.apply(2));
        System.out.println(cosecop.apply(2));
        System.out.println(cotop.apply(2));
        System.out.println(arcsin.apply(2));
        System.out.println(arccos.apply(2));
        System.out.println(arctan.apply(2));
        System.out.println(logop.apply(2));
        System.out.println(log10base.apply(2));
        System.out.println(expop.apply(2));
        System.out.println(absvalue.apply(2));
        System.out.println(toRadiansop.apply(2));
        System.out.println(toDegreeop.apply(2));
        System.out.println(percentage.apply(2));
        System.out.println(reciprocal.apply(2));
        System.out.println(negate.apply(2));
        System.out.println(factorial.apply(2));
    }
}
