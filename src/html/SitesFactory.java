
package html;


public class SitesFactory {
    public static Website createwebsite (TypeOfSite typeofsite) {
     switch(typeofsite) {
       case GALERY: return new Galery();
       case INFORMATION: return new Information();
       case CONTACT: return new Contact();
       case NEWS: return new News();
       default: return null;
        }}}