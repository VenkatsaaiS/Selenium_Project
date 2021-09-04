package com.mypackage.se;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_Textfile {

    public static void main(String[] args) throws IOException {

        String Filepath= "C:\\Users\\Venkatasai\\Desktop\\file.txt";

        BufferedReader bufferedReader=new BufferedReader(new FileReader(Filepath));
        String startLine;

        while ((startLine = bufferedReader.readLine())!=null)
        {
            System.out.println(startLine);
        }
    }
}
