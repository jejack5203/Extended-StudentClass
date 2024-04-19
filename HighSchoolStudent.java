/**************************************************************************
 * Subclass High School Student
 *************************************************************************/
public class HighSchoolStudent extends Student
{
    private static final int minCoursesToGraduate = 22;
    private static final int passingGrade = 65;

    //the constructors
    HighSchoolStudent(String firstName, String lastName)
    {
        super(firstName, lastName);
    }
    HighSchoolStudent(String firstName, String lastName, String address, String city, String state, String email)
    {
        super(firstName, lastName, address, city, state, email);
    }

    //Override superclass methods
    void registerCourse(String id, String desc, String instructor)                      //course info is arbitrary
    {
        Course c = new Course(id, desc, instructor);
        addCourse(c);       
    }
    void registerCourse(CatalogCourse co)                                               //course info is from catalog
    {
        Course c = new Course(co.courseId, co.description, co.instructor);
        addCourse(c);           
    }

    boolean isGraduateEligible()
    {       
        int courseCount = 0;
 
        for (Course c : courses)
            if (c != null && c.getGrade() >= passingGrade)
                courseCount += 1;
        
        return(courseCount >= minCoursesToGraduate ? true : false);
    }

    public String toString ()
    {
        String data = "High School Student... \n" + super.toString();           
        return (data);
    }
}