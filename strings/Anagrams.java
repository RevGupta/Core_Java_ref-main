package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter input String 1 : ");
        String inputString1 = br.readLine();

        System.out.print("Enter input String 2 : ");
        String inputString2 = br.readLine();


        if(isAnnagrams(inputString1,inputString2))
            System.out.println("Anagrams");
        else
            System.out.println("Not anagrams");
    }

    public static boolean isAnnagrams(String inputString1,String inputString2){
        if(inputString1==null || inputString2==null)
            return false;

        char[] inpustString1CharArray = inputString1.replace(" ","").toCharArray();
        char[] inpustString2CharArray = inputString2.replace(" ","").toCharArray();
        Arrays.sort(inpustString1CharArray);
        Arrays.sort(inpustString2CharArray);

        if(inpustString1CharArray.length != inpustString2CharArray.length)
            return false;
        else{
            for(int i=0;i<inpustString1CharArray.length;i++) {
                if (inpustString1CharArray[i] != inpustString2CharArray[i])
                    return false;
            }
        }
        return true;
    }
}