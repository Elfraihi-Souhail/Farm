package student2;

import java.util.ArrayList;

public class History {
    ArrayList<Alert> Alerts;
    
    public History(){
        Alerts = new ArrayList<Alert>();
    } 

    public void addAlert(Alert alert){
        Alerts.add(alert);
    }
    
    public void removeAlert(Alert a){
        this.Alerts.remove(a);
    }

    
}
