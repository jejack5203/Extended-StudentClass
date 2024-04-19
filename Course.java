/**************************************************************************
 * The Course class
 *************************************************************************/
public class Course 
{
    private String courseId;
    private String description;
    private String instructor;    
    private int    credit;
    private int    grade;

    //constructors
    public Course(String courseId, String desc, String instructor)
    {
        this.courseId    = courseId;
        this.description = desc;
        this.instructor  = instructor;
    }
    public Course(String courseId, String desc, String instructor, int credit)
    {
        this(courseId, desc, instructor);
        this.credit = credit;           
    }

    //getters and setters
    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String id) {
        this.courseId = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    //toString() method
    public String toString()
    {
        String data = "Course: " + courseId  + "/" + description + 
                      "\tInstructor: " + instructor;
 
        data += (credit > 0) ? "\tCredit: " + credit : "";         
        data += (grade  > 0) ? " Grade: "   + grade  : ""; 
         
        return (data);
    }
}