/**************************************************************************
 * The course Catalog class
 * Load a course catalog
 *************************************************************************/
public class CatalogCourse 
{
    String type;                                        //instance fields 
    String courseId;                                    //each course will have these fields
    String description;
    String instructor;    
    int    credit;
    double price;

    static final double pricePerCredit = 1199.95;    

    //constructors
    public CatalogCourse(String type, String courseId, String desc, String instructor)
    {
        this.type        = type;
        this.courseId    = courseId;
        this.description = desc;
        this.instructor  = instructor;
    }
    public CatalogCourse(String type, String courseId, String desc, String instructor, int credit)
    {
        this(type, courseId, desc, instructor);
        this.credit = credit;
        this.price  = credit * pricePerCredit;      
    }

    //load catalog courses
    //return an array of catalog courses
    public static CatalogCourse[] loadCourses()
    {
        CatalogCourse[] cat_course = new CatalogCourse[50];

        cat_course[0]  = new CatalogCourse("HS", "HS-001", "English I","Mr English");
        cat_course[1]  = new CatalogCourse("HS", "HS-002", "English II", "Ms English");
        cat_course[2]  = new CatalogCourse("HS", "HS-003", "Writing", "Mr Smith");
        cat_course[3]  = new CatalogCourse("HS", "HS-004", "Communication", "Ms Brown");
        cat_course[4]  = new CatalogCourse("HS", "HS-005", "Literature", "Mr Murphy");
        cat_course[5]  = new CatalogCourse("HS", "HS-006", "Spanish", "Ms Espaniola");
        cat_course[6]  = new CatalogCourse("HS", "HS-007", "French", "Mr Francais");
        cat_course[7]  = new CatalogCourse("HS", "HS-008", "German", "Ms Deutsch");
        cat_course[8]  = new CatalogCourse("HS", "HS-009", "Italian", "Mr Italiano");
        cat_course[9]  = new CatalogCourse("HS", "HS-010", "Latin", "Ms Latina");
        cat_course[10] = new CatalogCourse("HS", "HS-011", "Math", "Mr Smart");
        cat_course[11] = new CatalogCourse("HS", "HS-012", "Algebra", "Ms Algo");
        cat_course[12] = new CatalogCourse("HS", "HS-013", "Geometry", "Mr Sphere");
        cat_course[13] = new CatalogCourse("HS", "HS-014", "Statistics", "Ms Stat");
        cat_course[14] = new CatalogCourse("HS", "HS-015", "Calculus", "Mr Cane");
        cat_course[15] = new CatalogCourse("HS", "HS-016", "Biology", "Ms Bailey");
        cat_course[16] = new CatalogCourse("HS", "HS-017", "Chemistry", "Mr Silver");
        cat_course[17] = new CatalogCourse("HS", "HS-018", "Physics", "Ms Lenora");
        cat_course[18] = new CatalogCourse("HS", "HS-019", "Psychology", "Mr Shrink");
        cat_course[19] = new CatalogCourse("HS", "HS-020", "Economics", "Ms Richards");
        cat_course[20] = new CatalogCourse("HS", "HS-021", "Computers", "Mr Compute");
        cat_course[21] = new CatalogCourse("HS", "HS-022", "Web Prog", "Ms Webster");
        cat_course[22] = new CatalogCourse("HS", "HS-023", "App Dev", "Mr Apple");
        cat_course[23] = new CatalogCourse("HS", "HS-024", "Animation", "Ms Anime");
        cat_course[24] = new CatalogCourse("HS", "HS-025", "Graphics", "Mr Graphite");
        
        cat_course[25] = new CatalogCourse("COL", "CL-001", "English", "Prof English", 3);
        cat_course[26] = new CatalogCourse("COL", "CL-002", "Arts", "Prof Artist", 3);
        cat_course[27] = new CatalogCourse("COL", "CL-003", "Biology I", "Prof Bailey", 4);
        cat_course[28] = new CatalogCourse("COL", "CL-004", "Biology II", "Prof Bailey", 4);
        cat_course[29] = new CatalogCourse("COL", "CL-005", "Biochemistry", "Prof Mixed", 4);
        cat_course[30] = new CatalogCourse("COL", "CL-006", "Chemistry I", "Prof Gold", 4);
        cat_course[31] = new CatalogCourse("COL", "CL-007", "Chemistry II", "Prof Gold", 4);
        cat_course[32] = new CatalogCourse("COL", "CL-008", "Languages", "Prof Classico", 3);
        cat_course[33] = new CatalogCourse("COL", "CL-009", "Literature", "Prof Little", 3);
        cat_course[34] = new CatalogCourse("COL", "CL-010", "Communication", "Prof Culver", 3);
        cat_course[35] = new CatalogCourse("COL", "CL-011", "CS I", "Prof Compute", 4);
        cat_course[36] = new CatalogCourse("COL", "CL-012", "CS II", "Prof Compute", 4);
        cat_course[37] = new CatalogCourse("COL", "CL-013", "Data Struct", "Prof Struct", 4);
        cat_course[38] = new CatalogCourse("COL", "CL-014", "Java", "Prof Sultan", 4);
        cat_course[39] = new CatalogCourse("COL", "CL-015", "Web Dev", "Prof Sultan", 4);
        cat_course[40] = new CatalogCourse("COL", "CL-016", "Spanish", "Prof Espaniol", 3);
        cat_course[41] = new CatalogCourse("COL", "CL-017", "French", "Prof Francais", 3);
        cat_course[42] = new CatalogCourse("COL", "CL-018", "German", "Prof Deutsch", 3);
        cat_course[43] = new CatalogCourse("COL", "CL-019", "Italian", "Prof Italiano", 3);
        cat_course[44] = new CatalogCourse("COL", "CL-020", "Latin", "Prof Latina", 3);
        cat_course[45] = new CatalogCourse("COL", "CL-021", "Math", "Prof Smart", 20);
        cat_course[46] = new CatalogCourse("COL", "CL-022", "Pre-Med", "Prof Perry", 25);
        cat_course[47] = new CatalogCourse("COL", "CL-023", "Accounting", "Prof Ace", 23);
        cat_course[48] = new CatalogCourse("COL", "CL-024", "Bus&Fin", "Prof Busy", 22);
        cat_course[49] = new CatalogCourse("COL", "CL-025", "Special", "Prof Stuart", 20);
        
        return(cat_course);
    }

    public static void main(String[] args)
    {    
        CatalogCourse[ ] cat_course = loadCourses();                                //load the course catalog

        for(CatalogCourse c : cat_course)
            System.out.printf("%4s %7s %-14s %-14s %3d %8.2f \n",c.type,c.courseId,c.description,c.instructor,c.credit,c.price);
    }
}