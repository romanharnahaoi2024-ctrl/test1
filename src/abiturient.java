public class abiturient {
    private String name;
    private String surname;
    private int course;

    public abiturient(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void displayInfo() {
        System.out.println("Абітурієнт: " + name + " " + surname + ", курс: " + course);
    }
}
