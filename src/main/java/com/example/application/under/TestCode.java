package com.example.application.under;




import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
/**
 *
 * Test for securitycode
 * Not in use in this version
 *
 * @author Erik Andreas Vold -  erikvold84@gmail.com
 */
public class TestCode {


    Scanner scanner = new Scanner(System.in);
    Scanner fileIn; //input file connection
    PrintWriter fileOut; //HTML file connection
    String filenameIn; //original file's name
    String filenameOut; //new HTML file's name
    int dotIndex; //position of . in filename
    String line = null; // a line from the input file
    int tall1;
    int tall2;
    int tall3;
    String tekst;
    int year;
    int mnd;
    int dag;
    boolean ok;
    int primtall = 17;

    TestCode() throws IOException{

        LocalDate dataString = LocalDate.now();

        //	   System.out.println(dataString);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String yearString = dataString.format(pattern);
        //	   System.out.println(yearString);
        String part = yearString.substring(6,10);
        Integer iWrapperyear = parseInt(part);
        year = iWrapperyear;
        //		System.out.println(year);
        Integer iWrappermnd = parseInt(yearString.substring(3,5));
        mnd = iWrappermnd;
        //		System.out.println(mnd);
        Integer iWrapperdag = parseInt(yearString.substring(0,2));
        dag = iWrapperdag;
        //		System.out.println(dag);
        //	System.out.println("Enter file name or path");
        //	filenameIn = scanner.nextLine();

        try {
            Boolean utvid = false;
            String xx= "c:" + "\\" + "License" + "\\" +  "License" + "." + "wps";
            FileReader tekstFilLeser = new FileReader(xx);
            BufferedReader tekstLeser = new BufferedReader(tekstFilLeser);
            String post = tekstLeser.readLine();
            //		System.out.println("lest inn: " + post );
            tekstLeser.close();
            int length = post.length();


            for ( int i = 0; i<3; i++) {
                int i1 = post.indexOf(":");
                String first = post.substring(i1+1,length);
                tekst = post.substring(0,i1);
                //		System.out.println(first);
                int i2 = first.indexOf(":");
                String middel = first.substring(i2+1,first.length());
                //		System.out.println(middel);
                int i3 = middel.indexOf(":");
                String last = middel.substring(i3+1,middel.length());
                String value1=  first.substring(0,i2);
                String value2 = middel.substring(0,i3);
                int i4 = last.indexOf( ":");
                //		System.out.println(last);
                String siste = last.substring(0,i4);
                String value3 = siste;
                int tall4 = last.length();
                //		System.out.println("  svar:  " + value1 + " - " + value2+ " - " +value3);
                //		System.out.println(i1 + " " + i2 + " "+ i3);
                Integer iWrapper1 = Integer.valueOf(value1);
                tall1 = iWrapper1;
                Integer iWrapper2 = Integer.valueOf(value2);
                tall2 = iWrapper2;
                Integer iWrapper3 = Integer.valueOf(siste);
                tall3 = iWrapper3;

            }
            int test = (tall1*tall2) % 991 ;
            //		System.out.println(tall1 + tekst+ tall2);
            if( test != tall3 ) {
                System.out.println("License code wrong");
            } else {
                //			tall1 = 3439;
                //			tall2 = 1391;
                //			System.out.println("License ok");
                int nyYear = (tall1*10 + (tall2 / 1000)) / primtall;
                int nyMnd = (tall2 % 1000) /primtall - primtall ;
                //		System.out.println(nyYear + "  "  + nyMnd);
                ok = false;
                if ( nyMnd == mnd && nyYear == year) {
                    ok = true;
                    System.out.println("License short time" + (30-dag)+ " again. Order new license!");  // 30 - dag
                }
                if ( nyMnd >= mnd && nyYear == year) {
                    ok = true;
                }
                if ( nyYear > year) {
                    ok = true;
                }
                //		System.out.println(ok);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }



    }
}








