package com.learning.week1;

public class OperatorPractice {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        double c = 10.0;

        // 1. 算术运算符
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b (integer division) = " + (a / b)); // 结果是 3
        System.out.println("c / b (floating point division) = " + (c / b)); // 结果是 3.33...
        System.out.println("a % b = " + (a % b)); // 结果是 1
        System.out.println("-------------------------");

        // 2. 自增/自减
        int x = 5;
        int y = ++x; // 前缀：先 x = x + 1 (x=6), 再 y = x (y=6)
        System.out.println("After ++x: x = " + x + ", y = " + y);
        int z = y++; // 后缀：先 z = y (z=6), 再 y = y + 1 (y=7)
        System.out.println("After y++: y = " + y + ", z = " + z);
        System.out.println("-------------------------");

        // 3. 关系运算符
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));   // true
        System.out.println("a <= b: " + (a <= b)); // false
        System.out.println("-------------------------");

        // 4. 逻辑运算符 (与短路效果)
        boolean condition1 = true;
        boolean condition2 = false;
        int counter = 0;

        System.out.println("condition1 && condition2: " + (condition1 && condition2)); // false
        System.out.println("condition1 || condition2: " + (condition1 || condition2)); // true
        System.out.println("!condition1: " + (!condition1)); // false

        // 验证 && 短路：如果左边是 false，右边 ++counter 不会执行
        boolean result1 = (b > a) && (++counter > 0); // b > a is false
        System.out.println("result1 (&& short-circuit): " + result1); // false
        System.out.println("counter after &&: " + counter); // counter 仍然是 0

        // 验证 || 短路：如果左边是 true，右边 ++counter 不会执行
        boolean result2 = (a > b) || (++counter > 0); // a > b is true
        System.out.println("result2 (|| short-circuit): " + result2); // true
        System.out.println("counter after ||: " + counter); // counter 仍然是 0
        System.out.println("-------------------------");

        // 5. 赋值运算符
        int d = 20;
        d += 5; // d = d + 5
        System.out.println("d after += 5: " + d); // 25
        d *= 2; // d = d * 2
        System.out.println("d after *= 2: " + d); // 50
        System.out.println("-------------------------");

        // 6. 三元运算符
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b is: " + max); // 10
        String type = (max % 2 == 0) ? "Even" : "Odd";
        System.out.println("Max number is: " + type); // Even
        System.out.println("-------------------------");

        // 7. 优先级与括号
        int trickyResult = 5 + 3 * 2; // 乘法优先，5 + 6 = 11
        int clearerResult = 5 + (3 * 2); // 使用括号更清晰
        int differentResult = (5 + 3) * 2; // 先加法，8 * 2 = 16
        System.out.println("trickyResult (5 + 3 * 2): " + trickyResult);
        System.out.println("clearerResult (5 + (3 * 2)): " + clearerResult);
        System.out.println("differentResult ((5 + 3) * 2): " + differentResult);
    }
}