public class StudentRecord {
    private String firstName;
    private String lastName;
    private String department;
    private int studentId;

    public StudentRecord(String firstName, String lastName, String department, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s %s, Dept: %s", studentId, firstName, lastName, department);
    }
}