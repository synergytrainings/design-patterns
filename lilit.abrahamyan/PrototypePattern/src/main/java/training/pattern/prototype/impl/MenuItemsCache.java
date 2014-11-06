package training.pattern.prototype.impl;

import java.util.HashMap;
import java.util.Map;
/**
 * Organization of cache for menu items
 * @author LilitsComp
 *
 */
public class MenuItemsCache {
	private static Map<Integer, MenuItem> menuItemsMap = new HashMap<>();

	/**
	 * Copies and returns item from cache
	 * @param itemId item id
	 * @return {@link MenuItem} item
	 */
	public static MenuItem getMenuItem(Integer itemId) {
		MenuItem menuItem = menuItemsMap.get(itemId);
		return new MenuItem(menuItem);
	}


	/**
	 * Menu items' cache initialization(can be load from DB, from file, etc)  
	 */
	public static void cacheLoad() {
		MenuItem item1 = new MenuItem(1, "Add");
		MenuItem item2 = new MenuItem(2, "Edit");
		MenuItem item3 = new MenuItem(3, "Remove");
		menuItemsMap.put(item1.getId(), item1);
		menuItemsMap.put(item2.getId(), item2);
		menuItemsMap.put(item3.getId(), item3);
	}
}
