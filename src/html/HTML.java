package html;

import java.util.Scanner;


public class HTML {
 public static void main(String[] args) {
 System.out.println("Choose type of website which you want to create:");
 System.out.println("1 - Photo Galery \n 2 - Information Site \n 3 - Contact Site \n 4 - News ");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt()-1;
       TypeOfSite typeofsite = TypeOfSite.values()[choose];
            System.out.println("Generated site: " + SitesFactory.createwebsite(typeofsite).getPageName());
        }}