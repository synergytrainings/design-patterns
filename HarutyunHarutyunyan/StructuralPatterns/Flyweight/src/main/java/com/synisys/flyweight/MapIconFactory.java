package com.synisys.flyweight;

import java.util.HashMap;

public class MapIconFactory {

	private static final HashMap<IconType, MapsIcon> icons = new HashMap<IconType, MapsIcon>();

	public static MapsIcon getIcon(IconType type) {
		MapsIcon icon = icons.get(type);

		if (icon == null) {
			if (type.equals(IconType.VECTOR)) {
				icon = new MapIconVector();
			} else if (type.equals(IconType.WARNING)) {
				icon = new MapIconWarning();
			}
			icons.put(type, icon);
		}
		return icon;
	}

}