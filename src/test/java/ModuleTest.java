import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ModuleTest {

    @Test
    public void Test_Junit_1_add_remove_students() {
        String name = "Software Engineering";
        String id = "CT417";

        Student student1 = mock(Student.class);
        Student student2 = mock(Student.class);
        when(student1.getUsername()).thenReturn("a1");
        when(student2.getUsername()).thenReturn("a2");

        Module uut = new Module(name, id);

        uut.addStudent(student1);
        uut.addStudent(student2);

        ArrayList<Student> expected = new ArrayList<Student>();
        expected.add(student1);
        expected.add(student2);

        Assert.assertEquals(expected, uut.get_students());

        uut.removeStudent("a1");
        Assert.assertNotEquals(expected, uut.get_students());


    }

    @Test
    public void Test_Junit_2_add_remove_courses() {
        String name = "Software Engineering";
        String id = "CT417";
        Module uut = new Module(name, id);

        Course_Programme c1 = mock(Course_Programme.class);
        Course_Programme c2 = mock(Course_Programme.class);

        uut.addAssociated_course(c1);
        uut.addAssociated_course(c2);

        ArrayList<Course_Programme> expected = new ArrayList();
        expected.add(c1);
        expected.add(c2);

        Assert.assertEquals(expected, uut.getAssociated_course());

        expected.remove(c1);
        uut.removeAssociated_courses(c1);

        Assert.assertEquals(expected, uut.getAssociated_course());
    }

    @Test
    public void Test_Junit_3_getters_setters()
    {
        String name = "Software Engineering";
        String id = "CT417";
        Module uut = new Module(name, id);

        Assert.assertEquals(uut.getId(), "CT417");
        Assert.assertEquals(uut.getModule_name(), "Software Engineering");

        uut.setId("new Id");
        uut.setModule_name("new Name");

        Assert.assertEquals(uut.getId(), "new Id");
        Assert.assertEquals(uut.getModule_name(), "new Name");
    }
}
