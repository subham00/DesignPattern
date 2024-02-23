public class Emailalertobserver implements NotificationAlertObserver{
    String email;
    Stockobserable ob;
    public Emailalertobserver(String email, Stockobserable ob){
        this.email = email;
        this.ob = ob;
    }
    public void update(){
        System.out.println(email + "  " + ob.getStock());
    }
}
