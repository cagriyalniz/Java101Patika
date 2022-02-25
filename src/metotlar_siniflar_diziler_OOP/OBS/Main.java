package metotlar_siniflar_diziler_OOP.OBS;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Ayşe", "90550000000", "MAT");


        mat.addTeacher(t1);


        Student s1 = new Student("Mehmet", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();
        mat.printTeacher();


    }
}
