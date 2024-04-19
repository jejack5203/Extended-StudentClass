/**************************************************************************
 * Subclass College Student
 *************************************************************************/
public class CollegeStudent extends Student
{
    private static final int minCreditsToGraduate = 122;
    private static final int passingGrade = 70;

    //the constructors
    CollegeStudent(String firstName, String lastName)
    {
        super(firstName, lastName);
    }
    CollegeStudent(String firstName, String lastName, String address, String city, String state, String email)
    {
        super(firstName, lastName, address, city, state, email);
    }

    //Override superclass methods
    void registerCourse(String id, String desc, String instructor, int credit)          //course info is arbitrary
    {
        Course c = new Course(id, desc, instructor, credit);
        addCourse(c);           
    } 
    void registerCourse(CatalogCourse co)                                               //course info is from catalog                                   
    {
        Course c = new Course(co.courseId, co.description, co.instructor, co.credit);
        addCourse(c);           
    }

    boolean isGraduateEligible()
    {
        int creditCount = 0;
 
        for (Course c : courses)
            if (c != null && c.getGrade() >= passingGrade)
                creditCount += c.getCredit();
        
        return(creditCount >= minCreditsToGraduate ? true : false);
    }

    public String toString ()
    {
        String data = "College Student... \n" + super.toString();               
        return (data);
    }
}