/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import entity.Reader;

import java.util.Scanner;

public class ReaderManager {
    private Scanner scanner;


    public ReaderManager() {
        scanner = new Scanner(System.in);

    }
    public Reader createReader() {
        Reader reader = new Reader();
        System.out.print("Введите имя читателя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию читателя: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Введите телефон читателя: ");
        reader.setPhone(scanner.nextLine());

        return reader;
    }

    public void printListReader(Reader[] readers) {
        for (int i = 0; i < readers.length; i++) {
            System.out.printf("%d. %s %s. Телефон: %s%n"
                    , i + 1
                    , readers[i].getFirstname()
                    , readers[i].getLastname()
                    , readers[i].getPhone()
            );
        }

    }

    
}
