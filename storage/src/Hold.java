import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private int sumWeight;
    private ArrayList<Suitcase> suitcaseList;


    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcaseList = new ArrayList<>();

    }
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + sumWeight <= maxWeight ){
            suitcaseList.add(suitcase);
            sumWeight = sumWeight + suitcase.totalWeight();
        }

    }
    public void printItems(){
        for(Suitcase bags : suitcaseList){
            bags.printItems();
        }

    }

    public String toString(){
        return suitcaseList.size() + " suitcases " + "(" + sumWeight +" kg)";

    }
}
