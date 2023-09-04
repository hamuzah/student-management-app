import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    @Autowired
    StudentRespiratory studentRespiratory;
    public Student getStudent(int regno){
        return studentRespiratory.getStudent(regno);

    }

    public String addStudent(Student student) {
         studentRespiratory.addStudent(student);
         return "student added successfully";
    }

    public Student updatestudent(int regno, int newage) {
        return studentRespiratory.updatestudent(regno,newage);
    }

    public String deleteStudent(int regno) {
         studentRespiratory.deleteStudent(regno);
         return "student deleted successfully";
    }

    public Student updatecourse(int regno, String course) {
        return studentRespiratory.updatecourse(regno,course);
    }
}
