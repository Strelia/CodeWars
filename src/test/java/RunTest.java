import com.strelia.removeFirstLastCharacter.RemoveChars;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class RunTest {

    public static void main(String[] args) throws Exception {
        JUnitCore runner = new JUnitCore();
        runner.addListener(new ExecutionListener());
//        runner.run(RemoveChars.class);
        Result result = runner.run(RemoveChars.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}
