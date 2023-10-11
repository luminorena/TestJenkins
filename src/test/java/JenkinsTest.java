import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class JenkinsTest {

    @DisplayName("Assert variable is true")
    @Test
    public void JenkinsTests() {
        var variable = true;
        Assertions.assertTrue(variable);

    }

}
