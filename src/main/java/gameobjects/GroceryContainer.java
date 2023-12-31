package gameobjects;

import java.util.ArrayList;
import java.util.List;

/** Represents an arraylist of groceries
 * @author Sijie Fan
 */
public class GroceryContainer extends ArrayList<Grocery>  {
    /**
     * Method to print out list of items in the shop
     * @author Sijie Fan
     * @return - String describing all groceries in a shop
     */
    public String describeShop() {
        String s = "";

        if (this.size() == 0) {
            s = "";
        } else {
            for (int i = 0; i <= this.size() - 1; i++) {
                Grocery t = this.get(i);
                int serial = i + 1;
                if (t instanceof Weapons)
                {
                s = s + "(" + serial + ") " + t.getName() + ": " + t.getDescription() + "\nDamage per attack: "+ ((Weapons) t).getDmg() +"\nPrice: " + t.price + "\n";}
                else if (t instanceof Item){
                    s = s + "(" + serial + ") " + t.getName() + ": " + t.getDescription() +"\nPrice: " + t.price + "\n";
                }
            }
        }
        return s;
    }


    /**
     * Method to print out list of items in a room
     * @author Sijie Fan
     * @return - String describing all groceries in a shop
     */
    public String describeThings() {
        String s = "";

        if (this.size() == 0) {
            s = "Unfortunately, nothing is here";
        } else {
            for (Grocery t : this) {
                s = s + t.getName() + ": " + t.getDescription() + "\n";
            }
        }
        return s;
    }
    /**
     * Method to print out names of a grocery list
     * @author Sijie Fan
     * @return - String describing all groceries in a shop
     */
    public List<String> toList() {
        List<String> rtn = new ArrayList<>();
        for (Grocery gc : this){
            rtn.add(gc.getName());
        }
        return rtn;
    }
}
