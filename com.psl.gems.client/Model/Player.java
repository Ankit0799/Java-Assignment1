package Model;

//POJO for Player
public class Player {
    private String name;
    private int index;

    
    public Player(String name, int index) {
        this.name = name;
        this.index = index;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    

    
    
}
