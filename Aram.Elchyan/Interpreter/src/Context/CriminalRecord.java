package Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aram on 1/4/2015.
 */
public class CriminalRecord {
    private String firstName;

    private String lastName;

    private int yearsSpentInJail;

    private List<Crime> crimes;

    public CriminalRecord(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        crimes = new ArrayList<Crime>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addCrime(Crime crime) {
        crimes.add(crime);
    }

    public List<Crime> getCrimes() {
        return crimes;
    }

    public void setYearsSpentInJail(int yearsSpentInJail) {
        this.yearsSpentInJail = yearsSpentInJail;
    }

    public int getYearsSpentInJail() {
        return yearsSpentInJail;
    }
}
