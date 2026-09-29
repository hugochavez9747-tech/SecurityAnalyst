/*
 * Hugo Chavez
 * CIS171 Online
 * Date: 09/21/26
 * Operating System: Mac
 * IDE:IntelliJ IDEA
 * Program Description(short):  Model class representing a security analyst, including fields, constructors, accessors, and behavior methods.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified
 * Documentation of Resources Used:
 */

package model;

public class SecurityAnalyst {

    private String analystName;
    private String certification;
    private int yearsExperience;
    private boolean activeIncident;

    // SecurityAnalyst - default constructor, sets placeholder values
    // none -> SecurityAnalyst
    public SecurityAnalyst() {
        analystName = "Unknown";
        certification = "None";
        yearsExperience = 0;
        activeIncident = false;
    }

    // SecurityAnalyst - non-default constructor, sets all fields
    // String, String, int, boolean -> SecurityAnalyst
    public SecurityAnalyst(String analystName, String certification, int yearsExperience, boolean activeIncident) {
        this.analystName = analystName;
        this.certification = certification;
        this.yearsExperience = yearsExperience;
        this.activeIncident = activeIncident;
    }

    public String getAnalystName() {
        return analystName;
    }

    public void setAnalystName(String analystName) {
        this.analystName = analystName;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public boolean isActiveIncident() {
        return activeIncident;
    }

    public void setActiveIncident(boolean activeIncident) {
        this.activeIncident = activeIncident;
    }

    // investigate - builds a message describing the analyst's activity
    // none -> String
    public String investigate() {
        return analystName + " is investigating a potential security incident.";
    }

    // toString - returns a String representing all field values
    // none -> String
    @Override
    public String toString() {
        return "SecurityAnalyst{analystName='" + analystName + "', certification='" + certification
                + "', yearsExperience=" + yearsExperience + ", activeIncident=" + activeIncident + "}";
    }
}