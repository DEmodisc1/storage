import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> list;
    private int maxWeight;
    private int sumWeights;

    public Suitcase(int max) {
        this.list = new ArrayList<>();
        this.maxWeight = max;
    }

    public void addItem(Item item) {
        if (sumWeights + item.getWeight() <= this.maxWeight) {
            sumWeights = sumWeights + item.getWeight();
            list.add(item);
        }
    }

    public void printItems(){
        for(Item items: list)
            System.out.println(items);
    }

    public int totalWeight(){
        return sumWeights;
    }

    public Item heaviestItem() {
        if (list.isEmpty()) {
            return null;
        }

        Item heaviest = list.get(0);

        for (Item item : list) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }


    public String toString() {
        int listSize = list.size();
        if (list.size() == 1) {
            return String.valueOf(listSize) + " item " + "(" + this.sumWeights + "kg)";
        }
            else if(list.size() == 0){
            return   "no items " + "(" + this.sumWeights + "kg)";

        } else {
            return String.valueOf(listSize) + " items " + "(" + this.sumWeights + "kg)";

        }
    }
}