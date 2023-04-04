public class StudentCaller {
    public static void main(String[] args) {
        // Parameterized Constructor
        StudentDetails ram = new StudentDetails(21, "Aashish", "MCA", 200000);
        // ram.takeinput(21, "Aashish", "MCA", 200000, "DIT");

        ram.showDetails();
System.out.println("------------------------------------");

        // Parameterized Constructor
        StudentDetails shyam = new StudentDetails(21, "shyam", "MCA", 500000);
        // shyam.takeinput(21, "shyam", "MCA", 500000, "DIT");

        shyam.showDetails();

    }
}
