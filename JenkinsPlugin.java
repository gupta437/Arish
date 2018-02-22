package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class JenkinsPlugin {

public static void main(String args[])
{
	 JenkinsPlugin pluginObject= new JenkinsPlugin();
	 pluginObject.run();
}

public void run()
{
String csv="C:\\Users\\Dipayan\\Desktop\\salaries.csv";
        BufferedReader br = null;
String line = "";
int sum=0;
int count=0;
//String a=new String();


        try {

            br = new BufferedReader(new FileReader(csv));
            try {
                while ((line = br.readLine()) != null) {

                        // use comma as separator
                    String[] country = line.split(",");
                    int sal=Integer.parseInt(country[2]);
                    sum=sum+sal;
                         count++;
                //System.out.println("Salary [job= " + country[0] 
                                  //        + " , salary=" + country[2] + "]");

                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("NA");
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }  
        System.out.println(sum/count);


        System.out.println("Done");
      }

    }