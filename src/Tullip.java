public class Tullip extends Flower{

    @Override
    public String toString() {
        return super.toString();
    }

    public Tullip() {
    }

    public void pouring(){
        this.chanceOfGrowth = 1.3*this.chanceOfGrowth;


    }



}
