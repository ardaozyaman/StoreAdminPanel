import java.util.Scanner;

public class MainMenu {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        BrandAdd brandAdd = new BrandAdd();
        brandAdd.brandDefault();
        ComputerAdd computerAdd = new ComputerAdd();
        computerAdd.computerDefault();
        PhoneAdd phoneAdd = new PhoneAdd();
        phoneAdd.phoneDefault();
        cases(brandAdd,computerAdd,phoneAdd);

    }

    public static void cases(BrandAdd brandAdd,ComputerAdd computerAdd,PhoneAdd phoneAdd) {
        Tables.mainMenuTable();
        int select = InputExceptionHandle.inputIntHandle();
        switch (select) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Tables.computerList(computerAdd);
                System.out.println("\n1 - Ekleme\t2 - Silme");
                select =InputExceptionHandle.inputIntHandle();
                switch (select){
                    case 1:
                        System.out.println("Marka ismi :");
                        String brandName = InputExceptionHandle.inputStringHandle();
                        System.out.println("id girin :");
                        int modelId = InputExceptionHandle.inputIntHandle();
                        System.out.println("Model adı");
                        String modelName = InputExceptionHandle.inputStringHandle();
                        System.out.println("Fiyat");
                        int price = InputExceptionHandle.inputIntHandle();
                        System.out.println("indirim oranı");
                        int saleRate = InputExceptionHandle.inputIntHandle();
                        System.out.println("Stok miktarı");
                        int stock = InputExceptionHandle.inputIntHandle();
                        System.out.println("Hafıza");
                        int memory = InputExceptionHandle.inputIntHandle();
                        System.out.println("Ram");
                        int ram = InputExceptionHandle.inputIntHandle();
                        System.out.println("Ekran Boyutu");
                        double screenSize = InputExceptionHandle.inputDoubleHandle();
                        computerAdd.addComputer(brandName,modelId,modelName,price,saleRate,stock,memory,ram,screenSize);
                        break;
                    case 2:
                        System.out.println("Silmek istenilen ürünün Id si :");
                        int removeId = InputExceptionHandle.inputIntHandle();
                        computerAdd.removeComputer(removeId);
                        break;
                    default:
                        System.out.println("Lütfen Geçerli Bir Seçim Yapın");
                }
                break;
            case 2:
                Tables.phoneList(phoneAdd);
                System.out.println("\n1 - Ekleme\t2 - Silme");
                select = InputExceptionHandle.inputIntHandle();
                switch (select){
                    case 1:
                        System.out.println("Marka ismi :");
                        String brandName = InputExceptionHandle.inputStringHandle();
                        System.out.println("id girin :");
                        int modelId = InputExceptionHandle.inputIntHandle();
                        System.out.println("Model adı");
                        String modelName = InputExceptionHandle.inputStringHandle();
                        System.out.println("Fiyat");
                        int price = InputExceptionHandle.inputIntHandle();
                        System.out.println("indirim oranı");
                        int saleRate = InputExceptionHandle.inputIntHandle();
                        System.out.println("Stok miktarı");
                        int stock = InputExceptionHandle.inputIntHandle();
                        System.out.println("Hafıza");
                        int memory = InputExceptionHandle.inputIntHandle();
                        System.out.println("Ram");
                        int ram = InputExceptionHandle.inputIntHandle();
                        System.out.println("Ekran Boyutu");
                        double screenSize = InputExceptionHandle.inputDoubleHandle();
                        System.out.println("Renk");
                        String color = InputExceptionHandle.inputStringHandle();
                        phoneAdd.addPhone(brandName,modelId,modelName,price,saleRate,stock,memory,ram,screenSize,color);
                        break;
                    case 2:
                        System.out.println("Silmek istenilen ürünün Id si :");
                        int removeId = InputExceptionHandle.inputIntHandle();
                        phoneAdd.removePhone(removeId);
                        break;
                    default:
                        System.out.println("Lütfen Geçerli Bir Seçim Yapın");
                }

                break;
            case 3:
                Tables.brandList(brandAdd);
                System.out.println("\n1 - Ekleme\t2 - Silme");
                select =InputExceptionHandle.inputIntHandle();
                switch (select){
                    case 1:
                        System.out.println("id girin :");
                        int id = InputExceptionHandle.inputIntHandle();
                        System.out.println("Marka ismi :");
                        String name = InputExceptionHandle.inputStringHandle();
                        brandAdd.addBrand(id,name);
                    break;
                    case 2:
                        System.out.println("Silmek istenilen Markanın Id si :");
                        int removeId = InputExceptionHandle.inputIntHandle();
                        brandAdd.removeBrand(removeId);
                    break;
                }
                break;
            default:
                System.out.println("Lütfen Geçerli Bir Seçim Yapın");
        }
        cases(brandAdd,computerAdd,phoneAdd);
    }

}



