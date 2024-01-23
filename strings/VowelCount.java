package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter input String : ");
        String inputString = br.readLine();

        System.out.println("Number of vowels --> "+vowelCountMethod(inputString));
    }

    public static int vowelCountMethod(String inputString){
        int vowelCount = 0 ;
        if(inputString ==  null)
            return vowelCount;

        inputString.toLowerCase();

        for(int i =0 ; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelCount++;
        }

        return vowelCount;
    }
}