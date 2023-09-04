import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRespiratory {

    HashMap<Integer, Student> db = new HashMap<>();

    public Student getStudent(int regno){
       return db.get(regno);
    }

    public void addStudent(Student student) {
        db.put(student.getRegno(),student);

    }

    public Student updatestudent(int regno, int newage) {
        db.get(regno).setAge(newage);
        return db.get(regno);
    }

    public void deleteStudent(int regno) {
        db.remove(regno);
        return;
    }

    public Student updatecourse(int regno, String course) {
        db.get(regno).setCourse(course);
        return db.get(regno);
    }
}
