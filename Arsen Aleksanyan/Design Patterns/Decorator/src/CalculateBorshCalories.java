import com.synisys.designpatterns.decorator.food.Beef;
import com.synisys.designpatterns.decorator.food.Beet;
import com.synisys.designpatterns.decorator.food.Cabbage;
import com.synisys.designpatterns.decorator.food.Carrot;
import com.synisys.designpatterns.decorator.food.Food;
import com.synisys.designpatterns.decorator.food.FoodMixture;
import com.synisys.designpatterns.decorator.food.Onion;
import com.synisys.designpatterns.decorator.food.decorator.BoiledFood;
import com.synisys.designpatterns.decorator.food.decorator.FriedFood;


public class CalculateBorshCalories {
	public static void main(String[] args) {
		Food soxarac = new FriedFood(new Onion(50), 3600);
		Food soxarac2 = new FriedFood(
							new FoodMixture(
									soxarac, 
									new Carrot(100),
									new Cabbage(150),
									new Beet(100)), 3600);
		
		Food boiledBeef = new BoiledFood(new Beef(500), 10000);
		
		Food borsh = new BoiledFood(
						new FoodMixture(
								boiledBeef, soxarac2), 9600);
		
		System.out.println(borsh.getCalories());
	}
}
