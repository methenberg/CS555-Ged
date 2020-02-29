import java.io.*;
import java.util.*;

public class Readfile {
    public static void main(String[] args)throws Exception {
        readGedcom("project1_huixiang_Xu_10444518.ged","output.txt");

    }
    public static void readGedcom(String inputFile, String outputFile)throws Exception{
        java.io.File sourceFile = new java.io.File(inputFile);
        if (!sourceFile.exists()){
            System.out.println("Sources file does not exist");
            System.exit(1);
        }

        java.io.File targetFile = new java.io.File(outputFile);
        if (targetFile.exists()){
            System.out.println("Target file already exists");
            System.exit(2);
        }

        try(
                Scanner input = new Scanner(sourceFile);
                java.io.PrintWriter output = new java.io.PrintWriter(targetFile);
        ){
            while(input.hasNext()){

                int level = input.nextInt();
                String tag = input.next();
                String arguments = input.nextLine().trim();
                String valid = "";

                output.println("-->" + level + " " + tag + " " + arguments);

                if(arguments.equals("FAM")||arguments.equals("INDI")){
                    String S1="";
                    S1 = tag;
                    tag = arguments;
                    arguments = S1;
                }

                if(tag.equals("INDI")||(tag.equals("NAME") && level == 1)||tag.equals("SEX")||tag.equals("BIRT")||
                        tag.equals("DEAT")||tag.equals("FAMC")||tag.equals("FAMS")||tag.equals("FAM")||
                        tag.equals("MARR")||tag.equals("HUSB")||tag.equals("WIFE")||tag.equals("CHIL")||
                        tag.equals("DIV")||(tag.equals("DATE") && level == 2)||tag.equals("HEAD")||tag.equals("TRLR")||
                        tag.equals("NOTE")){
                    valid = "Y";
                }else{
                    valid = "N";
                }

                output.println("<--" + level + "|" + tag + "|" + valid + "|" + arguments);
            }
        }
    }
}
