import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class duQuDeauful {
    public static void main(String[] args) {
        String conf = ".\\test.properties";
        try (InputStreamReader reader = new InputStreamReader(new FileInputStream(conf), StandardCharsets.UTF_8)) {
            int n;
            StringBuilder sb = new StringBuilder();
            while ((n = reader.read()) != -1) {
                sb.append((char) n);
            }
            System.out.println(sb);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
