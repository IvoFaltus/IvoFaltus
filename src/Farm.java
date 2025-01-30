import java.util.ArrayList;
import java.util.Properties;

public class Farm {


    private int balance;

private ArrayList<Property> properties = new ArrayList<>();

public void purchaseProperty(Property p){

    if(this.balance >= p.price){
        properties.add(p);

    }


}


}
