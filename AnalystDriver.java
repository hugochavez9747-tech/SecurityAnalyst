/*
* Hugo Chavez
* CIS171 Online
* Date: 09/21/26
* Operating System: Mac
* IDE:IntelliJ IDEA
* Program Description(short):  Driver program that demonstrates the SecurityAnalyst class, including both constructors, setters/getters, investigate(), and toString().
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or unmodified
* Documentation of Resources Used:
*/

package driver;

import model.SecurityAnalyst;

public class AnalystDriver {

    public static void main(String[] args) {

        // default object
        SecurityAnalyst analystOne = new SecurityAnalyst();
        System.out.println("Default Object:");
        System.out.println(analystOne);

        // demonstrate setters changing the default object
        analystOne.setAnalystName("Sarah Johnson");
        analystOne.setCertification("Security+");
        analystOne.setYearsExperience(3);
        analystOne.setActiveIncident(true);
        System.out.println("\nAfter Using Setters:");
        System.out.println(analystOne);

        // non-default object
        SecurityAnalyst analystTwo = new SecurityAnalyst("Michael Chen", "CISSP", 8, false);
        System.out.println("\nNon-Default Object:");
        System.out.println(analystTwo);

        // demonstrate a setter changing the non-default object
        analystTwo.setAnalystName("Michael Rodriguez");
        System.out.println("\nAfter Name Change:");
        System.out.println(analystTwo);

        // demonstrate a getter
        System.out.println("\nCertification:");
        System.out.println(analystTwo.getCertification());

        // demonstrate investigate() with both objects
        System.out.println("\nInvestigate Method:");
        System.out.println(analystOne.investigate());
        System.out.println(analystTwo.investigate());
    }
}