public class Main {

    public static void main(String[] args) {

        STUDENTDAO dao = new STUDENTDAO();

        // Insert Record
        dao.insertStudent(4, "Kiran", 23);

        // Update Record
        dao.updateStudent(4, "Kiran Kumar");
    }
}