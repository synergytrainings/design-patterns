package com.armen.mkrtchyan.interpreter.places;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @author Armen.Mkrtchyan.
 * @version 1.0
 * @since <pre>Dec 18, 2014</pre>
 */
public enum PlaceType {

    BANK {
        @Override
        public boolean isOfType(Place place) {
            return place instanceof Bank;
        }

        @Override
        protected Place createInstance(String name) {
            return new Bank(name);
        }
    }, HOTEL {
        @Override
        public boolean isOfType(Place place) {
            return place instanceof Hotel;
        }

        @Override
        protected Place createInstance(String name) {
            return new Hotel(name);
        }
    };

    private static Cache<String, Place> pool = CacheBuilder.newBuilder().build();

    public Place create(final String name) {
        try {
            return pool.get(name, new Callable<Place>() {
                @Override
                public Place call() throws Exception {
                    return createInstance(name);
                }
            });
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract boolean isOfType(Place place);
    protected abstract Place createInstance(String name);

    private static final HashMap<String, PlaceType> AVAILABLE_ENUMS = new HashMap<>();

    static {
        for (PlaceType placeType : values()) {
            AVAILABLE_ENUMS.put(placeType.name(), placeType);
        }
    }

    public static Place getPlaceFromName(String name) {
        return pool.getIfPresent(name);
    }

    public static PlaceType findType(String name) {
        if (AVAILABLE_ENUMS.containsKey(name.toUpperCase())) {
            return AVAILABLE_ENUMS.get(name);
        }
        name = StringUtils.chop(name.toUpperCase());
        if (AVAILABLE_ENUMS.containsKey(name)) {
            return AVAILABLE_ENUMS.get(name);
        }
        return null;
    }

}
