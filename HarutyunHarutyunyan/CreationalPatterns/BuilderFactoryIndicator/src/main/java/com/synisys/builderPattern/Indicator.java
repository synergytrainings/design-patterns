package com.synisys.builderPattern;

public class Indicator {
	private final int rFLevel1Id;
	private final int rFLevel2Id;
	private final int rFLevel3Id;
	
	/**
	 * Init abstract class for supporting inheritance
	 */
	protected static abstract class Init<T extends Init<T>> {
		private final int rFLevel1Id;
		private int rFLevel2Id;
		private int rFLevel3Id;

		/**
		 * getThis() will be overridden so that it will returns the appropriate "this"
		 * all of the Builder classes have identical definitions of getThis()
		 */
        protected abstract T getThis();

        public T rfLevel2Id(int rFLevel2Id) {
            this.rFLevel2Id = rFLevel2Id;
            return getThis();
        }
        
        public T rfLevel3Id(int rFLevel3Id) {
            this.rFLevel3Id = rFLevel3Id;
            return getThis();
        }

        public Indicator build() {
            return new Indicator(this);
        }
        
        /**
         * The builder constructor only receives the required attributes(in this case rFLevel1Id)
         * and this attributes are the only ones that are defined "final" on the builder to ensure that their values are set on the constructor.
         * */
        public Init(int rFLevel1Id) {
        	this.rFLevel1Id = rFLevel1Id;
		}
    }
	
	public static class Builder extends Init<Builder> {
        public Builder(int rFLevel1Id) {
			super(rFLevel1Id);
		}

		@Override
        protected Builder getThis() {
            return this;
        }
    }

	/**
	 * Subclass needs to be able to invoke its superclass's constructor. So we'll make it protected.
	 * */
    protected Indicator(Init<?> init) {
        this.rFLevel1Id = init.rFLevel1Id;
        this.rFLevel2Id = init.rFLevel2Id;
        this.rFLevel3Id = init.rFLevel3Id;
    }
}
