import java.lang.reflect.Method;

class Calculator{
    int a, b;
    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    private int multiply(int a, int b){
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception{
        Calculator calc = new Calculator(5,3);
        Class<?> cls = calc.getClass();

        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);
        int res = (int) method.invoke(calc,4,3);
        System.out.println(res);
    }
}
