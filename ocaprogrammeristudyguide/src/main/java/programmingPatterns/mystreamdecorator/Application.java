package programmingPatterns.mystreamdecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        int c;
        Character currentChar;

        try (LowerCaseInputStream stream = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("D:\\transformation-text.txt")))){

            while ((c = stream.read()) >= 0){

                currentChar = Character.valueOf((char) c);
                System.out.print(currentChar);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
