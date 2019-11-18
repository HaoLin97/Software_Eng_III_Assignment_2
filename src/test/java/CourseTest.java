import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import org.joda.time.DateTime;

import static org.mockito.Mockito.mock;

public class CourseTest {

    @Test
    public void Test_Junit_1_add_remove_modules(){
        Course_Programme uut = new Course_Programme("BP");

        Module m1 = mock(Module.class);
        Module m2 = mock(Module.class);
        uut.add_module(m1);
        uut.add_module(m2);

        ArrayList<Module> expected = new ArrayList<Module>();
        expected.add(m1);
        expected.add(m2);

        Assert.assertEquals(expected, uut.getList_of_modules());

        expected.remove(m1);
        uut.remove_module(m1);

        Assert.assertEquals(expected, uut.getList_of_modules());
    }
    @Test
    public void Test_Junit_2_add_remove_students(){
        Course_Programme uut = new Course_Programme("BP");

        Student s1 = mock(Student.class);
        Student s2 = mock(Student.class);
        uut.add_student(s1);
        uut.add_student(s2);

        ArrayList<Student> expected = new ArrayList<Student>();
        expected.add(s1);
        expected.add(s2);

        Assert.assertEquals(expected, uut.getList_of_students());

        expected.remove(s1);
        uut.remove_student(s1);

        Assert.assertEquals(expected, uut.getList_of_students());
    }

    @Test
    public void Test_Junit_3_getters_setters()
    {
        Course_Programme uut = new Course_Programme("BP");

        DateTime start = new DateTime("2000-01-01");
        DateTime end = new DateTime("2010-01-01");

        uut.setStart_date(start);
        uut.setEnd_date(end);

        Assert.assertEquals(start, uut.getStart_date());
        Assert.assertEquals(end, uut.getEnd_date());
        Assert.assertEquals("BP", uut.getName());
    }
}
