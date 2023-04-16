package day10.streams;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;

public class User {

    private String name;
    private LocalDate dateOfBirth;

    public User(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    //business logic method
    public int getAge() {
    	
    	// 2022 - 1979 = 43 - 1st user
        return dateOfBirth.until(IsoChronology.INSTANCE.dateNow()).getYears();
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("User{name=").append(name).append(", dateOfBirth=")
                .append(dateOfBirth).append("}");

        return builder.toString();
    }
}
