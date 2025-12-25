import com.gokhanul.classes.Abstraction;
import com.gokhanul.classes.GettersAndSetters;
import com.gokhanul.classes.ObjectExample;
import com.gokhanul.classes.ClassExample;

public class Main {

    public static void main(String[] args) {

        System.out.println("Example for TextBox Object");

        var textBox1 = new ClassExample();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text.toUpperCase());

        var textBox2 = new ClassExample();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text.toUpperCase());

        System.out.println();
        System.out.println("===============================================================");
        System.out.println();

        System.out.println("Example for Employee Object");

        var employee = new ObjectExample();
        System.out.println(employee.baseSalary);

        System.out.println();
        System.out.println("===============================================================");
        System.out.println();

        System.out.println("Example for using getters and setters");

        var GettersAndSetters = new GettersAndSetters();
        GettersAndSetters.setBaseSalary(50_000);
        GettersAndSetters.setHourlyRate(20);
        int wage = GettersAndSetters.wageCal(20);
        System.out.println(wage);

        System.out.println();
        System.out.println("===============================================================");
        System.out.println();

        System.out.println("");


    }
}
