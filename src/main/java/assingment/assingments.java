package assingment;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class assingments {


    public static void main(String[] args) throws IOException {

        // home/suleiman/Downloads/firstNameJava.txt
        Path path = Paths.get("/home/suleiman/Downloads/firstNameJava");
        List<String> list = Files.readAllLines(path);

        // print the count of names which start with B
        long countB = list.stream().filter(name -> name.toLowerCase().startsWith("b")).count();
        System.out.println("Names which starting with 'B': " + countB);

        // create a list of names which start C and contains 's' in it
        List<String> listCS = list.stream()
                .filter(name -> name.toLowerCase().startsWith("c"))
                .filter(name -> name.contains("s"))
                .toList();
        System.out.println("Names that starts with 'C' and has 's'" + listCS.size());

        // print the total number of chars for all the names starting with M
        List<Integer> charCountList = new ArrayList<>();
        int totalChar = list.stream()
                .filter(name -> name.toLowerCase().startsWith("m"))
                .map(String::trim)
                .map(String::length)
                .mapToInt(number -> number)
                .sum();
        System.out.println("Total char of the names that start with 'M': " + totalChar);

        // Finding the names containing '-' in it and replace it whith a space; collect them into a list
        List<String> listHifen = list.stream()
                .filter(name -> name.toLowerCase().contains("-"))
                .map(name -> name.replace("-", " "))
                .toList();
        System.out.println("Total names which has '-': " + listHifen.size());

        // Find the name which has more number of chars
        String biggestName = list.stream()
                .max(Comparator.comparing(s -> s.length())) // comparando a String pelo tamanho dela
                .get();

        System.out.println(biggestName);


    }
}
