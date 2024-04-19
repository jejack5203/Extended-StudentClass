/**************************************************************************
 * Abstract Superclass Student
 *************************************************************************/
public abstract class Student 
{
        //the static fields
        private static final String LOCALE = "New York";
        private static   int nextStudentID = 1000;
            
        //the instance fields
        private int    studentID;
        private String firstName, lastName, address, city, state, email = "";

        protected Course[] courses = new Course[40];

        //the constructors
        Student(String firstName, String lastName)
        {
            this.firstName = firstName;
            this.lastName  = lastName;
            this.studentID = ++nextStudentID;
        }
        Student(String firstName, String lastName, String address, String city, String state, String email)
        {
            this(firstName,lastName);  
            this.address = address;
            this.city = city;
            this.state = state;
            this.email = email;
        }

        //methods - will be overriden in subclasses using polymorphism 

        void registerCourse(String id, String desc, String instructor) {}                       //method stub
        void registerCourse(String id, String desc, String instructor, int credit) {}           //method stub 
        void registerCourse(CatalogCourse course) {}                                            //method stub

        abstract boolean isGraduateEligible();                                                  //abstract method

        //add a course to the courses array
        void addCourse(Course c)
        { 
            int i=0;
            while(courses[i] != null)           //if array element is occupied
                i++;                            //next
            this.courses[i] = c;
        }                

        //grade a course
        void gradeCourse(String id, int grade)
        {
            Course c = findCourseById(id);
            c.setGrade(grade);
        }

        //find a course by courseId
        private Course findCourseById(String id)
        {
            Course course = null;

            for (Course c : courses)
            {
                String courseId = c.getCourseId();
                if (c != null && courseId.equals(id))
                {
                    course = c;
                    break;              //once found, no need to continue
                }
            }
            return course;                         
        }

        //the getter methods
        int getStudentID()
        {
            return(studentID);
        }           
        String getFirstName()
        {
            return(firstName);
        }
        String getLastName()
        {
            return(lastName);
        }
        String getFullName()
        {
            return(firstName + " " + lastName);  
        }
        String getAddress()
        {
            return(address);
        }
        String getCity()
        {
            return(city);
        }
        String getState()
        {
            return(state);
        }    
        String getEmail()
        {
            return(email);
        }

        //the setter methods
        void setFirstName(String fname)
        {
            firstName = fname;
        }
        void setLastName(String lname)
        {
            lastName = lname;
        }
        void setAddress(String address)
        {
            this.address = address;
        }
        void setCity(String city)
        {
            this.city = city;
        }
        void setState(String state)
        {
            this.state = state;
        }
        void setEmail(String email)
        {
            this.email = email;
        }
            
        //the toString() method used to print the objects
        public String toString ()
        {
            int coursesTaken=0;
            while(courses[coursesTaken] != null)
                coursesTaken++;

            String data = "Student Number: " + studentID     + "\n" +
                          "Student Name..: " + getFullName() + "\n" +
                          "Address.......: " + address       + "\t" + city + "\t" + state + "\n" + 
                          "Email Addr....: " + email         + "\n" +
                          "Courses Taken.: " + coursesTaken  + "\n";
                
            for (Course c : courses)
                if (c != null) 
                    data += "\t" + c + "\n";
                
            return (data);
        }
}