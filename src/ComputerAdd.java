import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class ComputerAdd {
    private ArrayList<Computers> computersArrayList = new ArrayList<>();
    public class CustomComparator implements Comparator<Computers> {

        @Override
        public int compare(Computers o1, Computers o2) {
            return o1.getModelId()-o2.getModelId();
        }
    }
    public void addComputer(String brandName,int modelId, String modelName, int price, int saleRate, int stock, int memory, int ram, double screenSize){

        Iterator<Computers> myItr = computersArrayList.iterator();
        while (myItr.hasNext()) {
            Computers computers = myItr.next();
            if (computers.getModelId()==modelId) {
                System.out.println("bu id mevcut");
            }
            else if (myItr.hasNext()== false&&computers.getModelId()==modelId){
                computersArrayList.add(new  Computers ( brandName, modelId,  modelName,  price,  saleRate,  stock,  memory,  ram,  screenSize));
                break;
            }
        }

        Collections.sort(computersArrayList,new CustomComparator());
    }

    public void computerDefault() {
        computersArrayList.add(new Computers("Samsung", 1, "Galaxy", 3500, 15, 200, 64, 8, 6.7));
        computersArrayList.add(new Computers("Apple", 2, "Iphone 11", 3500, 15, 200, 64, 8, 6.7));
        computersArrayList.add(new Computers("Huawei", 3, "Mate 10", 3500, 15, 200, 64, 8, 6.7));
    }
    public void removeComputer(int removeId){
        Iterator<Computers> Itr = computersArrayList.iterator();
        while (Itr.hasNext()) {
            Computers computers = Itr.next();
            if (computers.getModelId()==removeId) {
                Itr.remove();
            }
            else{
            }
        }
    }

    public ArrayList<Computers> getComputersArrayList() {

        return computersArrayList;
    }

    public void setComputersArrayList(ArrayList<Computers> computersArrayList) {

        this.computersArrayList = computersArrayList;
    }

}
