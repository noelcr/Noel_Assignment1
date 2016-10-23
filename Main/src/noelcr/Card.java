package noelcr;


/**
 * Created by Noel on 26/09/2016.
 */
public class Card {
    private int id;
    private String name;
    private String s;

//    public Card(int id) {
//        this.id = id;
//    }

//    public String getName() {
//        return name;
//    }
    public Card(int i){
        id = i;
        name = s;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public String toString() {
        return "id=" + id + "\n ";
    }
}
