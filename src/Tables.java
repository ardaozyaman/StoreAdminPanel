import java.util.TreeSet;

public class Tables {
    public static void mainMenuTable() {
        System.out.println(" ");
        System.out.println("Yönetim Paneline Hoş geldiniz");
        System.out.println("=================================");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Telefon İşlemleri");
        System.out.println("3 - Markaları İşlemleri");
        System.out.println("0 - Çıkış");

    }

    public static void brandList(BrandAdd brandAdd) {
        System.out.println("\n=================================");
        for (Brands brands:brandAdd.getBrandsArrayList()){
            System.out.println(brands.getId()+"-"+brands.getName());
        }
    }

    public static void computerMenuTable() {
        System.out.println(" ");
        System.out.println("Notebook İşlemleri ");
        System.out.println("=================================");
        System.out.println("1 - Notebook Listele/ekle/sil");
        System.out.println("2 - Ana Menüye Dön");
        System.out.println("0 - Çıkış");
    }

    public static void phoneMenuTable() {
        System.out.println(" ");
        System.out.println("Telefon İşlemleri ");
        System.out.println("=================================");
        System.out.println("1 - Telefon Listele/ekle/sil");
        System.out.println("2 - Ana Menüye Dön");
        System.out.println("0 - Çıkış");
    }

    public static void computerList(ComputerAdd computerAdd) {

        System.out.println(" ");
        System.out.println("Notebook Listesi ");
        System.out.println("=================================");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID | Ürün İsmi                   | Fiyat      | Marka      | Stok    | Ekran Boyutu | RAM        |");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        for (Computers computers : computerAdd.getComputersArrayList()) {
            System.out.println("|   " + computers.getModelId() + "  | " + computers.getModelName() + "    |   " + computers.getPrice() + "    |   " + computers.getBrandName() + "    |   " + computers.getStock() + "    |   " + computers.getScreenSize() + "   |  " + computers.getRam() + "  |");
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }
    }
    public static void phoneList(PhoneAdd phoneAdd){

        System.out.println(" ");
        System.out.println("Telefon Listesi ");
        System.out.println("=================================");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println(
                "| ID | Ürün İsmi                   | Fiyat      | Marka      | Stok    | Ekran Boyutu | RAM        |");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        for (Phones phones : phoneAdd.getPhonesArrayList()) {
            System.out.println("|   " + phones.getModelId() + "  | " + phones.getModelName() + "    |   " + phones.getPrice() + "    |   " + phones.getBrandName() + "    |   " + phones.getStock() + "    |   " + phones.getScreenSize() + "   |  " + phones.getRam()+"GB" + "  |");
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

    }
}
