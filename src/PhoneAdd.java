import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class PhoneAdd {
    private ArrayList<Phones> phonesArrayList = new ArrayList<>();
    public class CustomComparator implements Comparator<Phones>{
        @Override
        public int compare(Phones o1, Phones o2) {
            return o1.getModelId()-o2.getModelId();
        }
    }
    public void phoneDefault() {
        phonesArrayList.add(new Phones("Samsung", 1, "Galaxy", 3500, 15, 200, 64, 8, 6.7, "Mavi"));
        phonesArrayList.add(new Phones("Apple", 2, "Iphone 11", 3500, 15, 200, 64, 8, 6.7, "Mavi"));
        phonesArrayList.add(new Phones("Huawei", 3, "Mate 10", 3500, 15, 200, 64, 8, 6.7, "Mavi"));
    }
    public void removePhone(int removeId){
        Iterator<Phones> Itr = phonesArrayList.iterator();
        while (Itr.hasNext()) {
            Phones phones = Itr.next();
            if (phones.getModelId()==removeId) {
                Itr.remove();
            }
            else{
            }
        }
    }
    public void addPhone(String brandName, int modelId, String modelName, int price, int saleRate, int stock, int memory, int ram, double screenSize, String color) {

        Iterator<Phones> myItr = phonesArrayList.iterator();
        while (myItr.hasNext()) {
            Phones phones = myItr.next();
            if (phones.getModelId()==modelId) {
                System.out.println("bu id mevcut");
            }
            else if (myItr.hasNext()== false&&phones.getModelId()==modelId){
                phonesArrayList.add(new Phones(brandName, modelId, modelName, price, saleRate, stock, memory, ram, screenSize, color));
                break;
            }
        }
        Collections.sort(phonesArrayList,new CustomComparator());
    }

    public ArrayList<Phones> getPhonesArrayList() {
        return phonesArrayList;
    }

    public void setPhonesArrayList(ArrayList<Phones> phonesArrayList) {
        this.phonesArrayList = phonesArrayList;
    }
}
