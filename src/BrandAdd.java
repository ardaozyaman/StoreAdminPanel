import java.lang.reflect.Array;
import java.util.*;


public class BrandAdd  {

    private ArrayList<Brands> brandsArrayList = new ArrayList<>();
    public class CustomComparator implements Comparator<Brands> {

        @Override
        public int compare(Brands o1, Brands o2) {
            return o1.getId()-o2.getId();
        }
    }
    public void brandDefault(){
        brandsArrayList.add(new Brands(1,"Samsung"));
        brandsArrayList.add(new Brands(2,"Lenovo"));
        brandsArrayList.add(new Brands(3,"Apple"));
        brandsArrayList.add(new Brands(4,"Huawei"));
        brandsArrayList.add(new Brands(5,"Casper"));
        brandsArrayList.add(new Brands(6,"Asus"));
        brandsArrayList.add(new Brands(7,"HP"));
        brandsArrayList.add(new Brands(8,"Xiaomi"));
        brandsArrayList.add(new Brands(9,"Monster"));


    }
    public void addBrand(int id, String name){
        Iterator<Brands> myItr = brandsArrayList.iterator();
        while (myItr.hasNext()) {
            Brands brands = myItr.next();
            if (brands.getId()==id) {
                System.out.println("bu id mevcut");
            }
            else if (myItr.hasNext()== false&&brands.getId()==id){
                brandsArrayList.add(new Brands(id,name));
                break;
            }
        }
        Collections.sort(brandsArrayList, new CustomComparator());
    }

    public ArrayList<Brands> getBrandsArrayList() {
        return brandsArrayList;
    }

    public void setBrandsArrayList(ArrayList<Brands> brandsArrayList) {
        this.brandsArrayList = brandsArrayList;
    }
    public void removeBrand(int removeId){
        Iterator<Brands> myItr = brandsArrayList.iterator();
        while (myItr.hasNext()) {
            Brands brands = myItr.next();
            if (brands.getId()==removeId) {
                myItr.remove();
            }
            else{
            }
        }
    }

}
