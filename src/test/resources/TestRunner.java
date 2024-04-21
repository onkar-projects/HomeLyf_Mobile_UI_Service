
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        // Create TestNG instance
        TestNG testNG = new TestNG();

        // Create a list of XmlSuite
        List<XmlSuite> suites = new ArrayList<>();
        // Add testng.xml file to the suites list
        suites.add(new XmlSuite());
        
        // Set the list of XmlSuite to TestNG
        testNG.setXmlSuites(suites);

        // Run the tests
        testNG.run();
    }
}