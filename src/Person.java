import java.util.ArrayList;

public class Person {
    private String name;
    private Computer computer;
    private Computer borrowedComputer;
    private ArrayList<Computer> computers;

    public Person(String name, Computer computer) {
        this.name = name;
        this.computer = computer;
        this.computers = new ArrayList<>();
        this.computers.add(computer);
    }

    public Person(String name) {
        this.name = name;
        this.computers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Computer getComputer() {
        return computer;
    }

    public Computer getBorrowedComputer() {
        return borrowedComputer;
    }

    public void borrowComputer(Computer computer) {
        this.borrowedComputer = computer;
    }

    // Method to buy a computer and add it to the list of owned computers
    public void buyComputer(Computer computer) {
        this.computers.add(computer);
    }

    // Accessor method to return the list of computers
    public ArrayList<Computer> getComputers() {
        return computers;
    }
}
