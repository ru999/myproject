package filehandling;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteAppend {

public static void main(String[] args) {
//Create and write to a file
PrintWriter w;
try {
w = new PrintWriter(new File("some.txt"));
w.println("Hey How Are You");

w.flush();
w.close();
} catch (FileNotFoundException e) {
System.out.println("Some issues : " + e.getMessage());
}


//File reading logic


StringBuilder b = new StringBuilder("");

try {
String data = "";

BufferedReader reader = new BufferedReader(new FileReader(new File("some.txt")));

while((data = reader.readLine())!= null) {
b.append(data + "\n");
}
} catch (FileNotFoundException e) {
System.out.println("Some issues : " + e.getMessage());
} catch (IOException e) {
//  Auto-generated catch block
e.printStackTrace();
}

System.out.println("Data in the file :"+b);

System.out.println(b);

//rreader.close();



}

}










