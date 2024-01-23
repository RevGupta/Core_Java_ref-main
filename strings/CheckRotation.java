package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckRotation {
    public static void main(String[] args) throws IOException {

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter input String 1 : ");
        String inputString1 = br.readLine();

        System.out.print("Enter input String 2 : ");
        String inputString2 = br.readLine();

        if(isRotated(inputString1,inputString2))
            System.out.println("The strings are rotated");
        else
            System.out.println("The strings are not rotated");
    }

    public static boolean isRotated(String str1,String str2){
        if(str1 == null || str2 == null)
            return false;
        else return str1.length() == str2.length() && (str1 + str1).contains(str2);
    }
}