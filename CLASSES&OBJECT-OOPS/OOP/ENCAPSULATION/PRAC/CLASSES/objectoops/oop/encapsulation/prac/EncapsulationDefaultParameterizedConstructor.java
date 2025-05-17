

 class Furniture{
    private int chairs;
    private String Table;

    public int getChairs() {
        return chairs;
    }

    public String getTable() {
        return Table;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }
    public void setTable(String table) {
        Table = table;
    }

    public Furniture(){
        System.out.println("Default Constructor. No Furniture");
    }

    public Furniture(int chairs, String Table){
        this.Table = Table;
        this.chairs = chairs;
    }
}


public class EncapsulationDefaultParameterizedConstructor {
    public static void main(String[] args) {
        Furniture Fur = new Furniture();
        Furniture Fur1 = new Furniture(5, "Round");
        System.out.println("Number of chairs: " + Fur1.getChairs() + "\nTable Type: " + Fur1.getTable());

    }
}
