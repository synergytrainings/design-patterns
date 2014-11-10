package training.pattern.prototype;

import training.pattern.prototype.impl.MenuItemsCache;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		MenuItemsCache.cacheLoad();
		
		if (MenuItemsCache.getMenuItem(1) == MenuItemsCache.getMenuItem(1)){
			System.out.println("Prototype pattern is not working");
		} else {
			System.out.println("Prototype pattern");
		}
		
	}

}
