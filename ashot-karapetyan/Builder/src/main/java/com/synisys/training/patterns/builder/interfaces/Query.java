package com.synisys.training.patterns.builder.interfaces;

/**
 * Created by Ashot Karapetyan on 11/4/2014.
 */
public interface Query {
	Select select(String... columns);
}
