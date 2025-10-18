package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SystemSupport {
    public static void main(String[] args) {
    Queue<Ticket> ticket = new LinkedList<>();
    Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the IT Support Ticketing System!");
        System.out.println("\n--- Enter Ticket Details ---");

        int numTicket = 3;
        for (int i = 1; i <= numTicket; i++){
            System.out.printf("Please enter details for ticket %d of %d\n", i, numTicket );

            System.out.print("Enter your name: ");
            String userName = sc.nextLine();

            System.out.print("Describe your issue: ");
            String issueDescription = sc.nextLine();

            Ticket newTicket = new Ticket(userName, issueDescription);
            ticket.add(newTicket);
            System.out.println();
        }
        sc.close();

        System.out.println("-------------------------------------------");
        System.out.println("All tickets have been logged.");
        System.out.println("There are 3 tickets waiting in the queue.");
        System.out.println("-------------------------------------------");

        System.out.println("\n--- Processing Tickets ---");

        int pendingTicket = 2;
        for(int i = 0; i < pendingTicket; i++){
            if(ticket.isEmpty()){
                System.out.println("No more pending tickets!");
                break;
            }
            Ticket currentTicket = ticket.poll();
            System.out.println("Resolving: "+ currentTicket);
        }
        System.out.println("-------------------------------------------");
        System.out.println();


        System.out.println("All done for now.");

        if(ticket.isEmpty()){
            System.out.println("Remaining tickets in queue: []");
        }else{
            Ticket remainingTicket = ticket.peek();
            System.out.println("Remaining tickets in queue: [" + remainingTicket + "]");
        }
    }
}