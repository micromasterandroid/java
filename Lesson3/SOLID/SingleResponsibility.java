import java.util.HashMap;
import java.util.Map;

public class SingleResponsibility {
    
    public static void main(String[] args) throws Exception {
        HashMap<Integer,Worker> companyWorkers = new HashMap<Integer,Worker>();

        //Adding two workers
        companyWorkers.put(170015,
            new Worker(170015, 5000, 20, "John Johnz", "Project Developer")
        );
        companyWorkers.put(170016,
            new Worker(170016, 5100, 20, "Rubi Ramos", "Project Manager")
        );

        //Initialize overtime hour payment for the two types of Job Titles
        SalaryCalculator.initOvertimeHourPayment();
        
        //Calculate Salary without extra hours
        HashMap<Integer,Integer> companyWorkersSalaries = SalaryCalculator.calculateWorkersSalary(companyWorkers);
        
        //Print to Console
        System.out.println("Salaries without extra hours:");
        System.out.println( companyWorkers.get(170015) + ",\n\tSalary: " + companyWorkersSalaries.get(170015) + " money unit" );
        System.out.println( companyWorkers.get(170016) + ",\n\tSalary: " + companyWorkersSalaries.get(170016) + " money unit" );
        
        //Adding Extra Hours
        companyWorkers.replace(170015,
                             companyWorkers.get(170015).addExtraHour(10) );
        companyWorkers.replace(170016,
                             companyWorkers.get(170016).addExtraHour(5) );
        
        //Calculate Salary without extra hours
        companyWorkersSalaries = SalaryCalculator.calculateWorkersSalary(companyWorkers);
        
        //Print to Console
        System.out.println("\n\nSalaries with extra hours:");
        System.out.println( companyWorkers.get(170015) + ",\n\tSalary: " + companyWorkersSalaries.get(170015) + " money unit" );
        System.out.println( companyWorkers.get(170016) + ",\n\tSalary: " + companyWorkersSalaries.get(170016) + " money unit" );
    }
}

//This class is just responsible of managing worker data
class Worker {
    private int basesalary, workhours, extrahourspermonth, ID;
    private String fullname, jobtitle;

    public Worker(int id, int basesalary, int workhours, String fullname, String jobtitle) {
        this.ID = id;
        this.basesalary = basesalary;
        this.workhours = workhours;
        this.fullname = fullname;
        this.jobtitle = jobtitle;
    }

    public Worker addExtraHour(int hoursperday){
        this.extrahourspermonth += hoursperday;
        return this;
    }

    public void resetExtraHour(){
        this.extrahourspermonth = 0;
    }

    public int getBaseSalary(){
        return this.basesalary;
    }
    public int getWorkHours(){
        return this.workhours;
    }
    public int getExtraHours(){
        return this.extrahourspermonth;
    }
    public String getFullName(){
        return this.fullname;
    }
    public String getJobTitle(){
        return this.jobtitle;
    }

    public String toString(){
        return this.fullname + " " + this.jobtitle;
    }
}

//This class is just responsible of calculate the salaries
final class SalaryCalculator {
    private static HashMap<String,Integer> extrahours = new HashMap<String,Integer>();
    
    private SalaryCalculator() {
        ;
    }
    public static void initOvertimeHourPayment() {
        extrahours.put("Project Developer", 40);
        extrahours.put("Project Manager", 25);
    }

    public static HashMap<Integer,Integer> calculateWorkersSalary(HashMap<Integer,Worker> companyWorkers) {
        HashMap<Integer,Integer> companyWorkersSalaries = new HashMap<Integer,Integer>();
        
        for(Map.Entry<Integer,Worker> workers : companyWorkers.entrySet()) {
            Integer id = workers.getKey();
            Worker worker = workers.getValue();
            int salary = worker.getBaseSalary() +
                        worker.getExtraHours() * extrahours.get( worker.getJobTitle() );

            companyWorkersSalaries.put(id, salary);
        }

        return companyWorkersSalaries;
    }
}