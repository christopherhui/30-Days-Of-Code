public class Citizen {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Citizen(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printCitizen() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}
