import java.util.Scanner;

// Operations:
// p) pin
// t) transfer
// g) get
// b) balance
// m) menu
// e) exit
//
// pin: Ask for a pin. Max 3 attempts. Otherwise exit.
// transfer: Add money to the balance.
// get: Get money from the balance.
// balance: Show the balance.
// menu: Show the menu.
// exit: Exit.
//
// https://stackoverflow.com/questions/13942701/take-a-char-input-from-the-scanner

public class bbva {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      float MAX_BALANCE = 10000000.00f;
      float balance = 5000.00f;
      int PIN = 1234;
      int attempts = 0;
      int userPIN;
      int transferido;
      int prestamo;

      System.out.println("Introduce el PIN:");
      // Your code here:
      userPIN = in.nextInt();

    // Enter the PIN code
    while (PIN != userPIN) {
      attempts = attempts + 1;

      if (attempts >= 3) {
        System.out.println("Demasiados intentos incorrectos");
        System.exit(1);
      } // Finish the execution

      System.out.println("PIN incorrecto");
      System.out.println("Introduce tu codigo PIN porfavor:");
      userPIN = in.nextInt();
    }

    printMenu();
    char menuOption = in.next(".").charAt(0);

    // Loop until e
    while (menuOption != 'e') {

      if (menuOption == 'b') {
        System.out.println("Tu saldo es : "+balance);
      } 
      else if (menuOption == 't') {
        System.out.println("Transferencia");
        System.out.println("Cuanto deseas transferir?");
        transferido = in.nextInt();
        balance = balance - transferido;
      }
      else if (menuOption == 'g') {
        System.out.println("Prestamo");
        System.out.println("Cuanto deseas recibir?");
        prestamo = in.nextInt();
        balance = balance + prestamo;
      }
      

      
      
        printMenu();
        menuOption = in.next(".").charAt(0);
    }

      // Ask a PIN (max 3 attempts)
      // If correct show menu


  //    System.out.println(c);

    //  if (c == 'm') {
    //  	printMenu();
  //    }

   }

   public static void printMenu() {
      System.out.println("MENU");
      System.out.println("--------------");
      System.out.println("t) transfer");
      System.out.println("g) get");
      System.out.println("b) balance");
      System.out.println("e) exit");
   }

 
}
