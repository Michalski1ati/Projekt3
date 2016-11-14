
package html;

public class Contact extends Website {
    public Contact() {
        super(
      "<!DOCTYPE html>" +
    "<html>" +
       "<head>" +
         "<meta charset=\"UTF-12\">" +
           "</head>" +
             "<body>" +
         "Biedronka<br>" +
         "ul. Kościelna 54<br>" + 
         "41-200 Sosnowiec<br>" +
         "tel.: 800 080 010<br>" +
         "Otwarte: od poniedziałku do piątku, w godz. 7.00 – 21.00<br>" +  
            "Sobota i Niedziela, w godz. 9.00 - 19.00"+
              "</body>" +
    "</html>"
        );
    }

    @Override
    public String getPageName() {
        return "Contact Site.html";
    }}