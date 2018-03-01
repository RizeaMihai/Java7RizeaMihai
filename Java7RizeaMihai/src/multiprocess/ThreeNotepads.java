/*
* Opening 3 Notepads
 */
package multiprocess;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Mihai Rizea
 */
public class ThreeNotepads {

    public static void main(String[] args) {
        try{   
        ProcessBuilder pb1 = new ProcessBuilder("Notepad.exe","Notepad1.txt");
        ProcessBuilder pb2 = new ProcessBuilder("Notepad.exe","Notepad2.txt");
        ProcessBuilder pb3 = new ProcessBuilder("Notepad.exe","Notepad3.txt");
        pb1.directory(new File("F:\\CursJava\\3notepads"));
        pb2.directory(new File("F:\\CursJava\\3notepads"));
        pb3.directory(new File("F:\\CursJava\\3notepads"));
        pb1.start();
        pb2.start(); 
        pb3.start();
            
        }
            catch(IOException e){
            System.out.println(e);
            }
    }
    
}