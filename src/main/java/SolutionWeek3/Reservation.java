package SolutionWeek3;

public class Reservation {
     private int TicketID;
        public Reservation(int TicketID){
            this.TicketID =TicketID;
        }
     public int showTicket(){
            System.out.println("Show TicketID: " + TicketID);
         return TicketID ;
     }

        public static void main(String[] args) {
            Reservation re = new Reservation(1234);
            re.showTicket();


    }

}
