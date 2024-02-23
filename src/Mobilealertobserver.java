public class Mobilealertobserver implements NotificationAlertObserver{
    String  mobileName;
    Stockobserable ob;
    public Mobilealertobserver(String mn , Stockobserable ob){
        this.mobileName = mn;
        this.ob = ob;
    }
    public void update(){
        System.out.println("mobile name " + mobileName);
    }
}
