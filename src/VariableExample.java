/**
 * @author bvanchuhov
 */
public class VariableExample {

    public static void main(String[] args) {
        int age = 25;

        age = age + 10; // 35
        age += 10; // 45

        age = age + 1;
        age += 1;
        age++;
        ++age;

        age--;
        --age;

        System.out.println(age);
    }
}
