public class ComputerDriver {
    public static void main(String[] args) {
        // Create a Computer object
        Computer computer1 = new Computer("Dell", "Inspiron");

        // Create a Person object (person1) and associate it with a computer
        Person person1 = new Person("Ahmed", computer1);

        // Print the owner's name and the computer details
        System.out.println("Owner: " + person1.getName() + ", Computer: " + person1.getComputer().getMake() + " " + person1.getComputer().getModel());

        // Create another Person object (person2) with only the name
        Person person2 = new Person("Ali");

        // person2 borrows the computer from person1
        person2.borrowComputer(computer1);

        // Print borrower and borrowed computer details
        System.out.println("Borrower: " + person2.getName() + ", Computer: " + person2.getBorrowedComputer().getMake() + " " + person2.getBorrowedComputer().getModel() + ", Owner: " + person1.getName());

        // Print out person1's computers
        System.out.println(person1.getName() + "'s computers:");
        for (Computer comp : person1.getComputers()) {
            System.out.println("Make: " + comp.getMake() + ", Model: " + comp.getModel());
        }

        // person1 buys more computers
        Computer computer2 = new Computer("Apple", "Ipad");
        Computer computer3 = new Computer("Toshiba", "Satellite");
        person1.buyComputer(computer2);
        person1.buyComputer(computer3);

        // Print updated list of person1's computers
        System.out.println(person1.getName() + "'s computers after buying more:");
        for (Computer comp : person1.getComputers()) {
            System.out.println("Make: " + comp.getMake() + ", Model: " + comp.getModel());
        }
    }
}
