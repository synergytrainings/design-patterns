package com.synisys.interfaces;

import com.synisys.models.Currency;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
    
    void dispense(Currency cur);
}
