package ua.nure.kn.strelchenya.usermanagement;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class User implements Serializable{
    private static final long serialVersionUID = -2667741113782604986L;
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName () {
        return new StringBuilder(getLastName())
                .append(", ")
                .append(getFirstName())
                .toString();
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getDateOfBirth());
        System.out.println(calendar.getTime());

        Calendar calendarNow = Calendar.getInstance();
        System.out.println(calendarNow.getTime());

        int rangeYear = calendarNow.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
        int rangeDayYear = calendarNow.get(Calendar.DAY_OF_YEAR) - calendar.get(Calendar.DAY_OF_YEAR);

        if (calendarNow.before(calendar)) { throw new IllegalArgumentException("Указана дата в будущем"); }
        else {
            if (rangeYear > 0) {
                if (rangeDayYear >= 0) { return rangeYear; }
                else {return rangeYear - 1;}
            } else {return 0;}
        }
    }
}
