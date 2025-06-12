import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LilleTest {
    private String name;
    private int salery;

    LilleTest(String name, int salery){
        this.name = name;
        this.salery = salery;
    }

    public String getBenifits(){
        if(salery >= 25000 && salery < 30000){
            return "Betalt Mobil";
        } else if(salery >= 30000 && salery < 40000){
            return "Gratis parkering";
        } else if(salery > 40000){
            return "Årlig bonus på 15%";
        }

        return "Ingen benifits :(";
    }

    public static void main(String[] args) {
        ArrayList<LilleTest> employeList = new ArrayList<>();

        employeList.add(new LilleTest("Marcus", 26000));
        employeList.add(new LilleTest("Anders", 35000));
        employeList.add(new LilleTest("Felix", 100000));

        try{
            FileWriter fileWriter = new FileWriter("src/EmployeList.csv",true);

            for(LilleTest employe : employeList){
                fileWriter.write("\n" + employe.getName() + "," + employe.getSalery());
            }

            fileWriter.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getName(){
        return name;
    }

    public int getSalery(){
        return salery;
    }
}
