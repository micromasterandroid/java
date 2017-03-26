public class Main{
  public static void main(String[] args) {
    String[] maleStudents = new String[5];
    maleStudents[0] = "James";
    maleStudents[1] = "John";
    maleStudents[2] = "David";
    maleStudents[3] = "Joseph";
    maleStudents[4] = "Charles";

    System.out.println("Male students");

    for(int sequence = 0; sequence < maleStudents.length; sequence++){
      System.out.println(sequence +  1 + ". " + maleStudents[sequence]);
    }

    String femaleStudents[] = {"Mary", "Susana", "Michelle", "Sarah", "Ashley"};

    System.out.println("Female students");

    for(int sequence = 0; sequence < femaleStudents.length; sequence++){
      System.out.println(sequence +  1 + ". " + femaleStudents[sequence]);
    }

    String[] studentList = new String[]{"Jason", "Gloria", "Paul", "Lisa"};

    System.out.println("Student lists");
    int sequence = 1;
    for(String student:studentList){
      System.out.println(sequence + ". " + student);
      sequence++;
    }
  }
}
