public class Catalog 
{
    String type;                                        //instance fields 
    String courseId;                                    //each course will have these fields
    String description;
    String instructor;    
    int    credit;
    double price;

    static final double pricePerCredit = 1199.95;    

    static Catalog[] catalog = new Catalog[50];         //I want a single catalog array (static)

    //constructors
    public Catalog(String type, String courseId, String desc, String instructor)
    {
        this.type        = type;
        this.courseId    = courseId;
        this.description = desc;
        this.instructor  = instructor;
    }
    public Catalog(String type, String courseId, String desc, String instructor, int credit)
    {
        this(type, courseId, desc, instructor);
        this.credit = credit;
        this.price  = credit * pricePerCredit;      
    }

    //load Course Catalog
    public static void loadCourses()
    {
        catalog[0]  = new Catalog("HS", "HS-001", "English I","Mr English");
        catalog[1]  = new Catalog("HS", "HS-002", "English II", "Ms English");
        catalog[2]  = new Catalog("HS", "HS-003", "Writing", "Mr Smith");
        catalog[3]  = new Catalog("HS", "HS-004", "Communication", "Ms Brown");
        catalog[4]  = new Catalog("HS", "HS-005", "Literature", "Mr Murphy");
        catalog[5]  = new Catalog("HS", "HS-006", "Spanish", "Ms Espaniola");
        catalog[6]  = new Catalog("HS", "HS-007", "French", "Mr Francais");
        catalog[7]  = new Catalog("HS", "HS-008", "German", "Ms Deutsch");
        catalog[8]  = new Catalog("HS", "HS-009", "Italian", "Mr Italiano");
        catalog[9]  = new Catalog("HS", "HS-010", "Latin", "Ms Latina");
        catalog[10] = new Catalog("HS", "HS-011", "Math", "Mr Smart");
        catalog[11] = new Catalog("HS", "HS-012", "Algebra", "Ms Algo");
        catalog[12] = new Catalog("HS", "HS-013", "Geometry", "Mr Sphere");
        catalog[13] = new Catalog("HS", "HS-014", "Statistics", "Ms Stat");
        catalog[14] = new Catalog("HS", "HS-015", "Calculus", "Mr Cane");
        catalog[15] = new Catalog("HS", "HS-016", "Biology", "Ms Bailey");
        catalog[16] = new Catalog("HS", "HS-017", "Chemistry", "Mr Silver");
        catalog[17] = new Catalog("HS", "HS-018", "Physics", "Ms Lenora");
        catalog[18] = new Catalog("HS", "HS-019", "Psychology", "Mr Shrink");
        catalog[19] = new Catalog("HS", "HS-020", "Economics", "Ms Richards");
        catalog[20] = new Catalog("HS", "HS-021", "Computers", "Mr Compute");
        catalog[21] = new Catalog("HS", "HS-022", "Web Prog", "Ms Webster");
        catalog[22] = new Catalog("HS", "HS-023", "App Dev", "Mr Apple");
        catalog[23] = new Catalog("HS", "HS-024", "Animation", "Ms Anime");
        catalog[24] = new Catalog("HS", "HS-025", "Graphics", "Mr Graphite");
        
        catalog[25] = new Catalog("COL", "CL-001", "English", "Prof English", 3);
        catalog[26] = new Catalog("COL", "CL-002", "Arts", "Prof Artist", 3);
        catalog[27] = new Catalog("COL", "CL-003", "Biology I", "Prof Bailey", 4);
        catalog[28] = new Catalog("COL", "CL-004", "Biology II", "Prof Bailey", 4);
        catalog[29] = new Catalog("COL", "CL-005", "Biochemistry", "Prof Mixed", 4);
        catalog[30] = new Catalog("COL", "CL-006", "Chemistry I", "Prof Gold", 4);
        catalog[31] = new Catalog("COL", "CL-007", "Chemistry II", "Prof Gold", 4);
        catalog[32] = new Catalog("COL", "CL-008", "Languages", "Prof Classico", 3);
        catalog[33] = new Catalog("COL", "CL-009", "Literature", "Prof Little", 3);
        catalog[34] = new Catalog("COL", "CL-010", "Communication", "Prof Culver", 3);
        catalog[35] = new Catalog("COL", "CL-011", "CS I", "Prof Compute", 4);
        catalog[36] = new Catalog("COL", "CL-012", "CS II", "Prof Compute", 4);
        catalog[37] = new Catalog("COL", "CL-013", "Data Struct", "Prof Struct", 4);
        catalog[38] = new Catalog("COL", "CL-014", "Java", "Prof Sultan", 4);
        catalog[39] = new Catalog("COL", "CL-015", "Web Dev", "Prof Sultan", 4);
        catalog[40] = new Catalog("COL", "CL-016", "Spanish", "Prof Espaniol", 3);
        catalog[41] = new Catalog("COL", "CL-017", "French", "Prof Francais", 3);
        catalog[42] = new Catalog("COL", "CL-018", "German", "Prof Deutsch", 3);
        catalog[43] = new Catalog("COL", "CL-019", "Italian", "Prof Italiano", 3);
        catalog[44] = new Catalog("COL", "CL-020", "Latin", "Prof Latina", 3);
        catalog[45] = new Catalog("COL", "CL-021", "Math", "Prof Smart", 20);
        catalog[46] = new Catalog("COL", "CL-022", "Pre-Med", "Prof Perry", 25);
        catalog[47] = new Catalog("COL", "CL-023", "Accounting", "Prof Ace", 23);
        catalog[48] = new Catalog("COL", "CL-024", "Bus&Fin", "Prof Busy", 22);
        catalog[49] = new Catalog("COL", "CL-025", "Special", "Prof Stuart", 20);
    }

    public static void main(String[] args)
    {
        Catalog.loadCourses();              //load the course catalog

        for(Catalog c : catalog)
            System.out.printf("%4s %7s %-14s %-14s %3d %8.2f \n",c.type,c.courseId,c.description,c.instructor,c.credit,c.price);
    }
}