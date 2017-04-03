import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserDemo2 {

  public static void main(String[] args) throws Exception {
    SAXParserFactory parserFactor = SAXParserFactory.newInstance();
    SAXParser parser = parserFactor.newSAXParser();
    SAXHandler handler = new SAXHandler();
    parser.parse(ClassLoader.getSystemResourceAsStream("Student.xml"), 
                 handler);
  }
}
/**
 * The Handler for SAX Events.
 */
class SAXHandler extends DefaultHandler {

  List<Student> stdList;
  Student std = null;
  String content = null;

  public void startDocument() throws SAXException {
    stdList = new ArrayList<>();
  }

  @Override
  //Triggered when the start of tag is found.
  public void startElement(String uri, String localName,
                           String qName, Attributes attributes)
                           throws SAXException {

    switch(qName){
      //Create a new Student object when the start tag is found
      case "student":
        std = new Student();
        std.id = attributes.getValue("id");
        std.active = attributes.getValue("active");
        break;
    }
  }

  @Override
  public void endElement(String uri, String localName,
                         String qName) throws SAXException {
   switch(qName){
     //Add the Student to list once end tag is found
     case "student":
       stdList.add(std);
       break;
     //For all other end tags the Student has to be updated.
     case "firstName":
       std.firstName = content;
       break;
     case "lastName":
       std.lastName = content;
       break;
     case "location":
       std.location = content;
       break;
   }
  }

  @Override
  public void characters(char[] ch, int start, int length)
          throws SAXException {
    content = String.copyValueOf(ch, start, length).trim();
  }

  public void endDocument() throws SAXException {
    //Printing the list of Students obtained from XML
    for (Student std : stdList){
      System.out.println(std);
    }
  }
}

class Student {

  String id;
  String active;
  String firstName;
  String lastName;
  String location;

  @Override
  public String toString() {
    return firstName + " " + lastName + "(" + id + ")" + location + " Active: " + active;
  }
}
