package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter input String : ");
        String inputString = br.readLine();

        System.out.println("The reverse by word string is : "+reverseWords(inputString));

    }

    public static String reverseWords(String inputString){
        if(inputString==null)
            return null;

        StringBuffer stringBuffer = new StringBuffer(inputString);
        String[] array = stringBuffer.reverse().toString().split(" ");
        if(array.length == 0)
            return inputString;
        else if(array.length == 1)
            return  (new StringBuffer(inputString)).reverse().toString();
        else {
            String outputString = "";
            for(int i= array.length-1;i>=0;i--)
                outputString += array[i]+" ";

            return outputString.substring(0, outputString.length() - 1);
        }
    }
}