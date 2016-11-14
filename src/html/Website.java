
package html;

import java.io.*;

public abstract class Website {
    public Website(String code) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(getPageName()));
            bw.write(code);
            bw.close();
        } catch(IOException ex) {
            System.out.println("Error");
        }}
    public abstract String getPageName();
}