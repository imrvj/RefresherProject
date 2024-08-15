package org.example;

public class VowelsCheck {

    public static void main(String[] args) {

        String a="Hello My Name is Ranvijay Singh";
        int vowels = 0;

        char[] arr = a.toCharArray();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == 'a' | arr[i] == 'e' | arr[i] == 'i' | arr[i] == 'o' | arr[i] == 'u' )
            {
                vowels++;
            }
        }

        System.out.print("Total Vowels  = " + vowels);
    }
}
