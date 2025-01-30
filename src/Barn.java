import java.util.ArrayList;

public class Barn {

    private ArrayList<Animal> small = new ArrayList<>();
    private ArrayList<Animal> big = new ArrayList<>();

    public void addSmallAnimal(Animal a) {
        if (small.size() >= 10) {


            System.out.println("List is full");

        } else {
            small.add(a);
        }

    }

public void addBigAnimal(Animal a){

    if (big.size() >= 10) {


        System.out.println("List is full");

    } else {
        big.add(a);
    }


}




    public void removeSmallAnimal(int index){
        small.set(index,null);

    }

    public void removeBigAnimal(int index){
        big.set(index,null);

    }






}
