
package html;

public class Galery extends Website {
    public Galery() {
        super(
     "<!DOCTYPE html>" +
 "<html>" +
       "<body>" +
        "<img src=\"http://bi.gazeta.pl/im/5/9096/z9096875Q,Adam-Malysz-podczas-lotow-narciarskich-w-Vikersund.jpg\" alt=\"Simple factory\">" +
       "</body>" +
 "</html>" );
    }

    @Override
    public String getPageName() {
        return "Photo Galery.html";
    }}