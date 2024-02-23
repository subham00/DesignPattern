public class Main {
    public static void main(String[] args) {
        Stockobserable Iphoneob = new Iphoneobserable();

        NotificationAlertObserver observer1 = new Emailalertobserver("abc",Iphoneob); // pass IPhone obserable so that it can call the methods of iphone
        NotificationAlertObserver observer2 = new Emailalertobserver("xyz",Iphoneob);
        Mobilealertobserver observer3 = new Mobilealertobserver("poco", Iphoneob); // this is also possible

        Iphoneob.add(observer1);
        Iphoneob.add(observer2);
        Iphoneob.add(observer3);

        Iphoneob.setStock(10);

    }
}