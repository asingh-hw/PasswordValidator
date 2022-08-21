package com.anand;

import java.io.*;

public class PasswordValidator {

    public static void main(String[] args) {

        final String ACCEPTABLE_LABLE = " is acceptable.";
        final String NOT_ACCEPTABLE_LABLE = " is not acceptable.";


        File inputFile = new File("resources/say.in");
        File outFile = new File("resources/say.out");

        if (!inputFile.exists() && !inputFile.isFile()) {
            System.out.println("input file say.in does not exist or is not a file");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile)); BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {

            if (!outFile.exists() && !outFile.createNewFile()) {
                System.out.println("Error while creating say.out output file");
                return;
            }

            String password;
            PasswordValidatorService service = new PasswordValidatorService();
            while ((password = br.readLine()) != null && !password.trim().equalsIgnoreCase("end")) {
                StringBuilder outputString = new StringBuilder(password);
                outputString.insert(0, "<");
                outputString.append(">");
                if (service.validatePassword(password)) {
                    outputString.append(ACCEPTABLE_LABLE);
                    bw.write(outputString.toString());
                } else {
                    outputString.append(NOT_ACCEPTABLE_LABLE);
                    bw.write(outputString.toString());
                }
                bw.newLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error while opening the input/output file ");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error while performing I/O operation");
            ex.printStackTrace();
        }

    }
}
