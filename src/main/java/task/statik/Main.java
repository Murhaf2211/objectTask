package task.statik;

public class Main {
    public static void main(String[] args) {
    Count counter = new Count();
    Count.incrementTotalCount();
    counter.incrementInstanceCount();

    Count counter2 = new Count();
    Count.incrementTotalCount();
    counter2.incrementInstanceCount();
      System.out.println(counter);
      System.out.println(counter2);
      System.out.println(counter2);
      Calculator calculator = new Calculator();
      int sum=calculator.add(4,8);
      System.out.println(sum);
      int sub=calculator.subtract(33, 7);
      System.out.println(sub);
      int mul=calculator.multiply(4,8);
      System.out.println(mul);
      int div=calculator.divide(4,8);
      System.out.println(div);
    }
}
