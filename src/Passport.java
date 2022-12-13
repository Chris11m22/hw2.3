public class Passport {
    private long numPassport;
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateBirth;

    public Passport(long numPassport, String lastName, String firstName, String middleName, String dateBirth) {
        this.numPassport = numPassport;
        if (lastName != null && !lastName.isEmpty() && !lastName.isBlank()) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException();
        }
        if (firstName != null && !firstName.isEmpty() && !firstName.isBlank()) {
            this.firstName = firstName;
        }
        this.middleName = middleName;
        if (dateBirth != null && !dateBirth.isEmpty() && !dateBirth.isBlank()) {
            this.dateBirth = dateBirth;
        }
    }

    public long getNumPassport() {
        return numPassport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "numPassport=" + numPassport +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}
