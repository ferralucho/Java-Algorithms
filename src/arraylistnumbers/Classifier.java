package arraylistnumbers;

import java.util.ArrayList;

public class Classifier {
    private ArrayList<Integer> listA;
    private ArrayList<Integer> listB;
    private ArrayList<Integer> listC;
    private ArrayList<Integer> listD;

    public void classify(ArrayList<Integer> a, ArrayList<Integer> b){
        this.listA = a;
        this.listB = b;
        this.listC = new ArrayList<Integer>();
        this.listD = new ArrayList<Integer>();

        ArrayList<Integer> checked = new ArrayList<Integer>();
        int num;
        for (int i = 0; i < listB.size(); i++){
            num = listB.get(i);
            if(!checked.contains(num)) {
                if (listA.contains(num)) {
                    this.listC.add(num);
                } else {
                    this.listD.add(num);
                }
                checked.add(num);
            }
        }
    }

    public ArrayList<Integer> getListC(){
        return this.listC;
    }

    public ArrayList<Integer> getListD(){
        return this.listD;
    }

}
