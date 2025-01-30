import java.util.ArrayList;
import java.util.concurrent.Flow;

public class FlowerPots extends Flower{
    @Override
    public String toString() {
        return super.toString();
    }

    private ArrayList<Flower> flowers = new ArrayList<>();


    public void addFlower(Flower f){

        flowers.add(f);
    }



    public void removeFlower(int index){
        flowers.set(index,null);

    }


}
