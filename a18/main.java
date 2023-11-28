import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;
public class applet2 extends Applet {
    public void paint(Graphics g) {
        Date currentDate = new Date();
        String date = currentDate.toString();
        g.drawString("system date is :" + date, 20, 50);
    }
}