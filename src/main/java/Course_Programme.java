import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course_Programme {

    String name;
    DateTime start_date;
    DateTime end_date;
    ArrayList<Student> list_of_students;
    ArrayList<Module> list_of_modules;

    public Course_Programme(String course_name)
    {
        name = course_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getStart_date() {
        return start_date;
    }

    public void setStart_date(DateTime start_date) {
        this.start_date = start_date;
    }

    public DateTime getEnd_date() {
        return end_date;
    }

    public void setEnd_date(DateTime end_date) {
        this.end_date = end_date;
    }

    public ArrayList<Student> getList_of_students() {
        return list_of_students;
    }
    public void add_student(Student student)
    {
        if(!list_of_students.contains(student))
        {
            list_of_students.add(student);
        }
    }

    public ArrayList<Module> getList_of_modules() {
        return list_of_modules;
    }

    public void add_module(Module module)
    {
        if(!list_of_modules.contains(module))
        {
            list_of_modules.add(module);
        }
    }
}
