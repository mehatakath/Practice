 /*
        [Class name]
        Author: [the name of the person who created the class. It might be different from yours]
        Date: [date]

        Description
        [Description about the class]
    */

package pushtogit;

/**
 *
 * @author Katrina
 */
public class Food {

    private String drink;
    private String eat;
    
    public Food(){
        
    }
    public Food(String name, String amount){
        eat = name;
        drink = amount;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
    
}

