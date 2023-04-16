package com.demo.exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileEdition {

private FileEdition fileEdition;
    private FileOutputStream fileOutputStream;


    FileEdition(){
	fileEdition = new FileEdition();
        fileOutputStream = new FileOutputStream("test.txt");
        fileOutputStream.write("Hi my name is".getBytes());
   

}

    //Write here logic to append the given content in the given file name
    public String fileEditor(String fileName, String content) {
        return null;
    }
}
