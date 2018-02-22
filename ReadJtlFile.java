package project;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class ReadJtlFile {

  public static void main(String argv[]) {
	  String fileName = "/Users/ankitagupta/Desktop/20180201-eureka.jtl";
	  System.out.println("Old File");
	  ArrayList<Double> Results1 = getResults(fileName);
	  System.out.println("Average "+Results1.get(0));
	  System.out.println("90th Percentile "+Results1.get(1));
	  System.out.println();
	  
	  fileName = "/Users/ankitagupta/Desktop/20180202-eureka.jtl";
	  System.out.println("New File");
	  ArrayList<Double> Results2 = getResults(fileName);
	  System.out.println("Average "+Results2.get(0));
	  System.out.println("90th Percentile "+Results2.get(1));
	  System.out.println();
	  
	  double avgPercent = ((Results2.get(0)-Results1.get(0))*100)/Results1.get(0);
	  System.out.println("Average "+avgPercent);
	  if(avgPercent>5 ) {
		  System.out.println("fail");
	  }else {
		  System.out.println("pass");
	  }
	  /*
	  double percentilePercent = ((Results1.get(1)-Results2.get(1))*100)/Results1.get(1);
	  System.out.println("Percentile "+percentilePercent);
	  if(percentilePercent<0 ||percentilePercent>5 ) {
		  System.out.println("Fail");
	  }else {
		  System.out.println("Pass");
	  }*/
  }
  
  public static ArrayList<Double> getResults(String fileName){
	  ArrayList<Double> Results = new ArrayList<Double> ();
	  ArrayList<Double> elapsed = new ArrayList<Double>();
	  Double sum = 0.0;
	  Double count = 0.0;
    try {
    File fXmlFile = new File(fileName);
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(fXmlFile);
    doc.getDocumentElement().normalize();
    NodeList nList = doc.getElementsByTagName("httpSample");
    

    for (int temp = 0; temp < nList.getLength(); temp++) {
        Node nNode = nList.item(temp);
        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
        	
            Element eElement = (Element) nNode;
            Double elapsedValue = Double.parseDouble(eElement.getAttribute("t"));
            elapsed.add(elapsedValue);
            sum+=elapsedValue;
            count++;
        }
    }
    //Display arraylist of elapsed time values
    Collections.sort(elapsed);
    double avg = (double)sum/count;
    int Index = (int)Math.ceil(((double)90 / (double)100) * (double)count);
    Results.add(avg);
    Results.add(elapsed.get(Index-1));
    } catch (Exception e) {
    e.printStackTrace();
    }
	return Results;
  }
}