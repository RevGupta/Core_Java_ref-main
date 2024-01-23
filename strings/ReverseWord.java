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
//        String[] array = inputString.split(" ");
//        if(array.length == 0)
//            return "";
//        String outputString = "";
//        StringBuffer stringBuffer;
//
//        for(int i=0;i< array.length-1;i++){
//            stringBuffer = new StringBuffer(array[i]);
//            outputString += stringBuffer.reverse().toString()+" ";
//        }
//        stringBuffer = new StringBuffer(array[array.length-1]);
//        outputString += stringBuffer.reverse().toString();
        StringBuffer stringBuffer = new StringBuffer(inputString);
        String[] array = stringBuffer.reverse().toString().split(" ");
        if(array.length == 0)
            return inputString;
        else if(array.length == 1)
            return  (new StringBuffer(inputString)).reverse().toString();
        else {
            //System.out.println(array.length);
            String outputString = "";
            for(int i= array.length-1;i>=0;i--)
                outputString += array[i]+" ";

            return outputString.substring(0, outputString.length() - 1);
        }
    }
}