import com.gokhanul.classes.Employee;
import com.gokhanul.classes.TextBoX;

public class Main {

    public static void main(String[] args) {

        System.out.println("Example for TextBox Object");

        var textBox1 = new TextBoX();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new TextBoX();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toUpperCase());

        System.out.println();
        System.out.println("===============================================================");
        System.out.println();

        System.out.println("Example for Employee Object");

        var employee = new Employee();
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        System.out.println();
        System.out.println("===============================================================");
        System.out.println();



    }
}
