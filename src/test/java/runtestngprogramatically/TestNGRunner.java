package runtestngprogramatically;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestNGRunner {
	
	public static void main(String[] args) {
		TestNG tng = new TestNG();

		XmlSuite suite = new XmlSuite();
		suite.setName("SuiteA");
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		tng.setXmlSuites(suites);

		
		XmlTest test = new XmlTest(suite);
		test.setName("flights");
		
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("runtestngprogramatically.SearchFlights"));
		test.setXmlClasses(classes) ;

		
		
		tng.run();
		
	}

}
