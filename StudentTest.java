/**************************************************************************
 * The Student build class
 *************************************************************************/
public class StudentTest
{
    public static void main(String[] args)
    {
        //load the course catalog
        CatalogCourse[] cat_course = CatalogCourse.loadCourses();
        
        //Polymorphism  
        //Notice I am storing all types of students in the same array

        Student[] student = new Student[100];
                                
        student[0] = new HighSchoolStudent("Tom","Jones");
        student[1] = new CollegeStudent("Fred","Smith");
        student[2] = new CollegeStudent("Bill","Anderson","10 Elm St.","Buffalo","NY","banderson@blah.com");
        student[3] = new CollegeStudent("Ellen","Wilson","13 4th Ave.","Boston","MA","ewilson@blah.edu");
        student[4] = new HighSchoolStudent("Mary","Holt","1 Front St.","Edison","NJ","mholt@blah.org");
        student[5] = new HighSchoolStudent("Jenn","Lu","1 Back St.","Brooklyn","NY","jlu@gmail.com");

        //use setters to complete the information for student[0] and [1]
        student[0].setAddress("88 12th St.");
        student[0].setCity("Boise");
        student[0].setState("ID");
        student[0].setEmail("fsmith@blahblah.com");

        student[1].setAddress("15 Oak Dr.");
        student[1].setCity("Newark");
        student[1].setState("NJ");
        student[1].setEmail("tjones@blahblah.edu");

        //Polymorphism - Notice the "right" registerCourse() method will be called

        //Adding/registering courses to College student
        student[2].registerCourse("CX-010","Java","Sam Sultan",3);          //course info is arbitrary
        student[2].registerCourse(cat_course[26]);                          //course info from the catalog

        student[3].registerCourse("CX-010","Java","Sam Sultan",4);             
        student[3].registerCourse(cat_course[39]);                      
        student[3].registerCourse("CX-011","SQL", "bbb bbbb",  10);
        student[3].registerCourse("CX-015","PHP", "ccc cccc",  15);
        student[3].registerCourse("CX-021","XML", "ddd dddd",  15);
        student[3].registerCourse("CX-032","HTML","eee eeee",  90);
                
        //Adding/registering courses to HS student
        student[4].registerCourse("HSX-001","English-1","Mrs. Browne"); 
        student[4].registerCourse("HSX-011","Biology ", "B. bbbbbbbb");
        student[4].registerCourse("HSX-123","Math-1  ", "C. cccccccc");
        student[4].registerCourse("HSX-124","French-1", "D. dddddddd");
        student[4].registerCourse(cat_course[13]);
        student[4].registerCourse("HSX-125","Chemistry","E. eeeeeeee");
        student[4].registerCourse("HSX-126","English-2","F. ffffffff");

        //Adding/registering many courses to HS student using a loop
        student[5].registerCourse("HSX-001","English-1","Mr. Smith");
        for (int i=2; i<=24; i++)
            student[5].registerCourse("HSX-0"+i , "Subject-"+i , "teacher-"+i);
                
        //Grading courses
        student[2].gradeCourse("CX-010",75);

        student[3].gradeCourse("CX-010",95);
        student[3].gradeCourse("CX-011",92);
        student[3].gradeCourse("CL-015",92);
        student[3].gradeCourse("CX-015",96);
        student[3].gradeCourse("CX-032",93);

        student[4].gradeCourse("HSX-001",85);
        student[4].gradeCourse("HSX-011",82);
        student[4].gradeCourse("HSX-126",83);

        //Grading many courses using a loop
        student[5].gradeCourse("HSX-001",92);
        for (int i=2; i<=24; i++)
            student[5].gradeCourse("HSX-0"+i , 86);
                    
        //looping through all students (College and High School)
        //the isGraduateEligible() method is polymorphic 
        //the "right" version will be called depending on the student

        for (int i=0; i<student.length; i++)
            if (student[i] != null)
            {
                boolean isGraduate = student[i].isGraduateEligible();  

                System.out.print(student[i]);                           //print content of entire object
                System.out.println("Graduating....? " + isGraduate);    //print whether eligible for graduation
                System.out.println();                               
            }
    }               
}