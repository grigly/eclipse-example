package com.example.eclipse.uebung3;

import java.util.Scanner;

public class EinmaleinsPrinter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Willkommen beim Einmaleins Printer");
    System.out.println("Großes oder kleines Einmaleins ausgeben? [groß/klein]");

    String str = scanner.next();
    if (str == "groß") {
      printEinmaleins(20);
    } else {
      printEinmaleins(10);
    }

    scanner.close();
  }

  static void printEinmaleins(int x ) {
    for (int i = 1; i<x; i++) {
      for (int j = 1; j < x; i++) {
        System.out.println(j + " * " + i + " = " + i * j);
      }
    }
  }
}
