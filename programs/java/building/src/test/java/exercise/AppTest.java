package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.apache.commons.io.IOUtils;

class AppTest {
    private static String execCommand() throws Exception {
        String command = "build/install/building/bin/building";
        Process process = Runtime.getRuntime().exec(command);
        String output = IOUtils.toString(process.getInputStream());
        process.waitFor();
        return output;
    }

    @Test
    void testOutput() throws Exception {
        String output = execCommand().trim();
        assertThat(output).isEqualTo("Hello, World!");
    }

    // BEGIN
    
    // END
}
