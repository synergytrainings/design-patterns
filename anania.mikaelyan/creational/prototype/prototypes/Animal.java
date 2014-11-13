package com.synisys.training.patterns.prototype.prototypes;

/**
 * @author Anania.Mikaelyan
 * @since 11/7/2014
 */
public interface Animal {
    Animal doClone();
    String getVoice();
    String getName();
}
