import java.util.ArrayList;

public class OpenClosed {
    private static ArrayList<PaperWork> universityprocedures = new ArrayList<PaperWork>();
    private static int idcounter = 17000;

    public static void main(String[] args) throws Exception {
        //Incriptions
        newincription(new FirstYearStudent("Personal Identity Document Data"));
        newincription(new ReEntryStudent("14101010"));
        newincription(new TransferedStudent("Previous Study on X University"));

        System.out.println("\nProcedures:");

        for (PaperWork procedure: universityprocedures) {
            System.out.println(procedure);
        }
    }
    //                                 interface instance
    public static void newincription(Inscription inscription){
        universityprocedures.add( inscription.procedure(idcounter) );
        idcounter++;
    }
}

class PaperWork {
    private int ID;
    private boolean automated;
    private String state, typeofprocedure, information;

    public PaperWork(int id, boolean automated, String state, String typeofprocedure, String information) {
        this.ID = id;
        this.automated = automated;
        this.state = state; //"InProcess" "Aproved" "Rejected"
        this.typeofprocedure = typeofprocedure; //"Inscription" "AssignCourses" "UnassignCourse" ...
        this.information = information; //Some data to Store
    }

    public String toString(){
        return this.ID + " " + this.state + " " + typeofprocedure + " " +
                ( (automated) ? "Automated" : "Manual" ) +
                "\n\t" + this.information;
    }
}

interface Inscription {
    public PaperWork procedure(int ID);
}

class FirstYearStudent implements Inscription {
    private String personalidentitydocument;
    public FirstYearStudent(String personalidentitydocument){
        this.personalidentitydocument = personalidentitydocument;
    }
    public PaperWork procedure(int ID) {
        System.out.println("Inscription of New Student");
        return new PaperWork(ID, false, "InProcess", "Inscription", personalidentitydocument);
    }
}

class ReEntryStudent implements Inscription {
    private String studentId;
    public ReEntryStudent(String studentId){
        this.studentId = studentId;
    }
    public PaperWork procedure(int ID) {
        System.out.println("Inscription of Re-Entry Student");
        return new PaperWork(ID, true, "InProcess", "Inscription", studentId);
    }
}

class TransferedStudent implements Inscription {
    private String previousStudies;
    public TransferedStudent(String previousStudies){
        this.previousStudies = previousStudies;
    }
    public PaperWork procedure(int ID) {
        System.out.println("Inscription of Transfered Student");
        return new PaperWork(ID, false, "InProcess", "Inscription", previousStudies);
    }
}
