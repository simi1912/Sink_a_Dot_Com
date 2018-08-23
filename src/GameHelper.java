import java.io.*;
public class GameHelper {
    public String getUserInput(String prompt) {
        String imputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            imputLine = is.readLine();
            if (imputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: "+e);
        }
        return imputLine;
    }
}
