import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Save Object in a file
public class SerializeObject {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream output = null;

        UserProfile localprofile = new UserProfile(
            "Jaime", "jaimito@gmail.com", "Green", "Some other data"
        );

        //Serializable
        try {
            output = new ObjectOutputStream( new FileOutputStream( "userProfile.txt" ) );
            output.writeObject(localprofile);
        } finally {
            if (output != null){
                output.close();
            }
        }

        //Deserialize
        UserProfile restoredprofile;
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream( new FileInputStream( "userProfile.txt" ) );
            restoredprofile = (UserProfile) input.readObject();

            System.out.println(restoredprofile);
        } finally {
            if (input != null){
                input.close();
            }
        }
    }
}

class UserProfile implements java.io.Serializable {
    private String name, email, themecolor;
    public transient String something;
    
    public UserProfile(String name, String email, String themecolor, String something){
        this.name = name;
        this.email = email;
        this.themecolor = themecolor;
        this.something = something;
    }

    public String toString(){
        return "User: " + name +
                "\nEmail: " + email +
                "\nTheme Color: " + themecolor +
                "\nSomething (transient): " + something;
    }
}