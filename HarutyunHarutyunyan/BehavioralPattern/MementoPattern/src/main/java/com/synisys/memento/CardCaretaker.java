package com.synisys.memento;

public class CardCaretaker {
	private Object obj;
    
    public void save(GiftCard card){
        this.obj = card.save();
    }
     
    public void undo(GiftCard card){
        card.undoToLastSave(obj);
    }
}
