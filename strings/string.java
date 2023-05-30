import java.util.StringTokenizer;

public class string {
    public static void main(String[] args) {
        String string1 = "hello/la-famille";
        StringTokenizer stringTokenizer = new StringTokenizer(string1, "/");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
