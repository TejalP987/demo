import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;;
public class Cars {
    
    private String color;
    private String modelType;
    private String gearType;
    private String fuelType;
    private String engineNo;

    public Cars(String color, String modelType, String gearType, String fuelType, String engineNo) {
        this.color = color;
        this.modelType = modelType;
        this.gearType = gearType;
        this.fuelType = fuelType;
        this.engineNo = engineNo;
    }

    public static char randomChar(){
        String alphabet = "CFS";
 
        Random r = new Random();
        return alphabet.charAt(r.nextInt(alphabet.length()));
    }

    
    public void print() {
        System.out.println("Cars [color=" + color + ", modelType=" + modelType + ", gearType=" + gearType + ", fuelType=" + fuelType
        + ", engineNo=" + engineNo + "]");
         
    }

    public String getColor() {
        return color;
    }

    public String getModelType() {
        return modelType;
    }


    public String getGearType() {
        return gearType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        List<String> Colors = Arrays.asList("Blue", "Green", "Red", "White", "Grey", "Yellow");
        List<String> Models = Arrays.asList("Sedan", "Hatchback", "SUV");
        List<String> GearType = Arrays.asList("Manual", "Automatic");
        List<String> FuelType = Arrays.asList("Petrol", "Deisel");

        ArrayList<Cars> listCars = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            String engNo = "0000" + randomChar() + rand.nextInt(3) + 'C';
            listCars.add(new Cars(Colors.get(rand.nextInt(6)), Models.get(rand.nextInt(3)), GearType.get(rand.nextInt(2)), 
            FuelType.get(rand.nextInt(2)), engNo));
        }

        //PRINTING CARS WHICH ARE GREEN AND SEDAN
        System.out.println("Sedans which are green are: ");
        listCars.stream().filter(Cars -> Cars.getColor() == "Green" && Cars.getModelType() == "Sedan").forEach(Cars -> Cars.print());
        System.out.println();

        //PRINTING CARS WHICH ARE YELLOW AND HAVE ENGINE NUMBER : 0000F1C
        System.out.println("Yellow Cars with engine number 0000F1C are: ");
        listCars.stream().filter(Cars -> Cars.getColor() == "Yellow" && Cars.getEngineNo() == "0000F1C").forEach(Cars -> Cars.print());
        System.out.println();

        //PRINTING CARS WHICH ARE AUTOMATIC AND DEISEL
        System.out.println("Deisel Automatic Cars are: ");
        listCars.stream().filter(Cars -> Cars.getFuelType() == "Deisel" && Cars.getGearType() == "Automatic").forEach(Cars -> Cars.print());
        System.out.println();

        //PRINTING CARS IN ORDER OF ENGINE NUMBER
        System.out.println("Cars in order of Engine Number: ");
        listCars.sort((Cars car1, Cars car2) -> car1.getEngineNo().compareTo(car2.getEngineNo()));
        for(int i = 0; i < listCars.size(); i++){
            listCars.get(i).print();
        }
        System.out.println();

        //PRINTING CARS WITH ENGINE NUMBER 0000S2C
        System.out.println("Cars with engine number 0000S2C are: ");
        listCars.stream().filter(Cars -> Cars.getEngineNo() == "0000S2C").forEach(Cars -> Cars.print());
        System.out.println();

        //PRINTING CARS WHICH ARE MANUAL 
        System.out.println("Cars Which are Manual: ");
        for(Cars i: listCars){
            if(i.getGearType() == "Manual"){
                System.out.println(i.getGearType() + " " + i.getModelType());
            }
        }
        System.out.println();

        //ORDERING THE CARS ON BASIS OF COLOR
        System.out.println("Cars Ordered on colour: ");
        listCars.sort((Cars car1, Cars car2) -> car1.getColor().compareTo(car2.getColor()));
        for(int i = 0; i < listCars.size(); i++){
            listCars.get(i).print();
        }
        System.out.println();

        //PRINTING CARS WHICH IS BLUE SUV AUTOMATIC
        System.out.println("Cars which are blue suv and automatic are: ");
        listCars.stream().filter(Cars -> Cars.getColor() == "Blue" && Cars.getModelType() == "SUV" && Cars.getGearType() == "Automatic").forEach(Cars -> Cars.print());
        System.out.println();
    }
    
}
