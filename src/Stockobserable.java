public interface Stockobserable {
    public void add(NotificationAlertObserver ob);
    public void delete(NotificationAlertObserver ob);

    public void nofify();
    public void setStock(int num);
    public int getStock();
}
