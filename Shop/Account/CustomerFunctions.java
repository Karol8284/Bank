package Shop.Account;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;


public class CustomerFunctions extends Customer{
    CustomerFunctions(String firstName, String lastName, String address, int age, double wage) {
        super(firstName, lastName, address, age, wage);
    }
        static boolean fileExist(File castomersDataFile){
            if (!castomersDataFile.exists()){
                try {
                    castomersDataFile.createNewFile();
                    System.out.println("Plik was create");
                    return false;
                }catch (Exception e){
                    System.out.println(e.getMessage());
                    return  true;
                }
            }
            return true;
        }



        static void addCustomer(){
            File f  = new File("ShopData/Customer/customersData.txt");

            if(fileExist(f)) {
                if (f.canWrite()) {
                    try {
                        Scanner scanner = new Scanner(System.in);
                        FileWriter fw = new FileWriter(f,true);
//                        Gson gsonB = new GsonBuilder().setPrettyPrinting().create();
                        Gson gson = new Gson();

                        System.out.println("Enter first name:");
                        String firstName = scanner.nextLine();

                        System.out.println("Enter last name:");
                        String lastName = scanner.nextLine();

                        System.out.println("Enter address:");
                        String address = scanner.nextLine();

                        System.out.println("Enter age:");
                        Integer age = scanner.nextInt();

                        System.out.println("Enter wage:");
                        double wage = scanner.nextDouble();


                        Customer customer = new Customer(firstName,lastName,address,age,wage);
                        String json = gson.toJson(customer);
                        fw.write(json+"\n");
                        System.out.println("Cilent data: "+firstName+" "+lastName+" "+address+" "+age+" "+wage
                        );

                        fw.close();
                        scanner.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }

    }

    private static void delateCustomer(){
        File f  = new File("ShopData/Customer/customersData.txt");
        if (f.exists()){
            if (f.canRead()){
                try {
                    Scanner sf = new Scanner(f);

                    Scanner s = new Scanner(System.in);
                    Formatter fm = new Formatter(f);
                    System.out.println("Podaj id Customer: ");
                    int idCD = s.nextInt();
                    Gson g = new Gson();
                    while (sf.hasNextLine()){
                        String text = sf.nextLine();
                        System.out.println(text);

                    }

                    s.close();
                    sf.close();
                }catch (Exception e){
                    System.out.println(e);
                }
            }

        }

    }

    static void unsubscribingCustomer(){
        File f = new File("ShopData/Customer/customersData.txt");
        try {
            Scanner sf = new Scanner(f);
            System.out.println(sf);
        }catch (Exception e){
            System.out.println(e);
        }
        if (fileExist(f)){
            if (f.canRead()){
                try {
//                    while ()
                    FileReader fr = new FileReader(f);
                    Scanner s = new Scanner(fr);
                    String json = String.valueOf(new JsonObject());
                    json = s.nextLine();
                    System.out.println(json);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
//        addCustomer();
        unsubscribingCustomer();
        delateCustomer();
    }
}