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

public class ReadFile {

  public static void main(String argv[]) {
	  ArrayList<Integer> elapsed = new ArrayList<Integer>();
	  Integer sum = 0;
	  Integer count = 0;
    try {
    File fXmlFile1 = new File("/Users/ankitagupta/Desktop/20180201-eureka.jtl");
    File fXmlFile2 = new File("/Users/ankitagupta/Desktop/20180202-eureka.jtl");
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    Document doc = dBuilder.parse(fXmlFile1);
    doc.getDocumentElement().normalize();

    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
    NodeList nList = doc.getElementsByTagName("httpSample");
    System.out.println("----------------------------");

    for (int temp = 0; temp < nList.getLength(); temp++) {
    	//System.out.println("Enter");
        Node nNode = nList.item(temp);
       // System.out.println("\nCurrent Element :" + nNode.getNodeName());
        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
        	
            Element eElement = (Element) nNode;
           // System.out.println("Staff id : "
             //                  + eElement.getAttribute("t"));
            Integer abc = Integer.parseInt(eElement.getAttribute("t"));
            elapsed.add(abc);
            sum+=abc;
            count++;
        }
    }
    //Display arraylist of elapsed time values
    Collections.sort(elapsed);
    for(int i=0;i<elapsed.size();i++) {
    		System.out.println(elapsed.get(i));
    }
    System.out.println("Sum "+ sum);
    double avg = (double)sum/count;
    System.out.println("Count "+count);
    System.out.println("Average "+avg);
    int Index = (int)Math.ceil(((double)90 / (double)100) * (double)count);
    System.out.println(elapsed.get(Index-1));
    } catch (Exception e) {
    e.printStackTrace();
    }
  }
}