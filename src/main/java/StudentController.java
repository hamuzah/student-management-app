import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
@RequestMapping("/student")
public class StudentController {

   @Autowired
   StudentServices studentServices;

    @GetMapping("/get")
    public ResponseEntity getStudent(@RequestParam("q") int regno){

        Student student =  studentServices.getStudent(regno);
        if(student == null){
            return new ResponseEntity("its doesnt exist",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity("found", HttpStatus.FOUND);
    }

    @PostMapping("/addstudent")
    public String addStudent(@RequestBody Student student){
       return   studentServices.addStudent(student);
    }

    //using path variable
//    @GetMapping("/addbypath/{id}")
//    public Student getStudent(@PathVariable("id") int regno){
//        return db.put(regno);
//    }

    @PutMapping("/update-age/{id}")
    public Student updatestudent(@RequestParam("id") int regno, @RequestParam("age") int newage ){
        return studentServices.updatestudent(regno,newage);

    }

    @DeleteMapping("/delete-stud/{id}")
    public String deleteStudent(@PathVariable("id") int regno){
        return studentServices.deleteStudent(regno);

    }

//    @DeleteMapping("/delete-student")
//    public Student deletestudent(@RequestParam("id") int regno){
//        return db.remove(regno);
//    }
    @PutMapping("/update-course")
    public Student updatecourse(@RequestParam("id") int regno,@RequestParam("course") String course){
        return studentServices.updatecourse(regno,course);

    }

//    @PutMapping("/change-course/{cou}")
//    public String changecourse(int regno, @PathVariable("cou") String course){
//        db.get(regno).setCourse(course);
//        return "course changed successfully";
//    }


}
