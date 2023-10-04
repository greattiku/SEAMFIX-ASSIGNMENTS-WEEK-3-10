package SolutionWeek3;

public class Reservation {
        int TicketID;
        public Reservation(int TicketID){
            this.TicketID =TicketID;
        }
        void showTicket(){
            System.out.println("Show TicketID: " + TicketID);
        }

        public static void main(String[] args) {
            Reservation re = new Reservation(1234);
            re.showTicket();


    }

}
