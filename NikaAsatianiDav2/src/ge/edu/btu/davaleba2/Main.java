package ge.edu.btu.davaleba2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        final Logger logger=Logger.getLogger(Main.class);
        File file = new File("C:\\Users\\user\\Downloads");
        Scanner scanner = new Scanner(System.in);
        System.out.println("shemoitanet sitkva : ");
        String word = scanner.nextLine();
        String[] names = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String a) {
                if (a.toUpperCase().contains(word.toUpperCase())) {
                    return true;
                } else {
                    return false;
                }
            }});

        logger.info("sitkva: " + word);
        for (String fileName : names) {
            logger.info(fileName);
        }
    }
}