import java.util.ArrayList;
import java.util.List;

public class Iphoneobserable implements Stockobserable{
    public List<NotificationAlertObserver> list = new ArrayList<>();
    int stockcount = 0;
    public void add(NotificationAlertObserver ob){
        list.add(ob);
    }
    public void delete(NotificationAlertObserver ob){
        list.remove(ob);
    }
    public void nofify(){
        for(int i=0;i<list.size();i++){
            NotificationAlertObserver ob = list.get(i);
            ob.update();
        }
    }
    public void setStock(int stock){
        if(stockcount == 0){
            stockcount = stock;
            nofify();
        }
    }
    public int getStock(){
        return stockcount;
    }
}
