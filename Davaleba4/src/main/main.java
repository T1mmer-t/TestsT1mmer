
package main;
import generators.Generator1;

import java.util.ArrayList;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        // write your code here
        String language;
        String parameters;
        Scanner scanner = new Scanner(System.in);
        System.out.print("language input: ");
        language = scanner.nextLine();
        System.out.print("parameters input: ");
        parameters = scanner.nextLine();
        String[] parametersArray = parameters.split("-");
        ArrayList param = new ArrayList();
        for (String parameter : parametersArray) {
            try {
                param.add(Integer.parseInt(parameter));
            } catch (NumberFormatException ignored) {
            } catch (Exception e) {
                System.out.println("arasworad chaweret ");
            }
        }
        System.out.println(param);
        Generator1 generator = new Generator1(language, param);
        generator.generateAlphabet();
        System.out.println(generator.generateSentence(param));
    }
    }
