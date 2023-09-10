package common;

import javax.swing.JOptionPane;
import java.io.File;

public class OpenPdf {

    public static void openById(String id) {
        try {
            if ((new File("C:\\Users\\anas hany\\Documents\\NetBeansProjects\\" + id + ".pdf")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\anas hany\\Documents\\NetBeansProjects\\" + id + ".pdf");
            } else {
                JOptionPane.showMessageDialog(null, "File is not Exists");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
