package com.synisys.builderPattern;

public class ActivityIndicator extends Indicator{
	private final double actualValue;
	private final double baselineValue;
	private final double targetValue;

    protected static abstract class Init<T extends Init<T>> extends Indicator.Init<T> {
    	

		private double actualValue;
    	private double baselineValue;
    	private double targetValue;
    	
    	public Init(int rFLevel1Id) {
			super(rFLevel1Id);
		}
    	
    	public T actualValue(double actualValue) {
            this.actualValue = actualValue;
            return getThis();
        }
    	
    	public T taselineValue(double baselineValue) {
            this.baselineValue = baselineValue;
            return getThis();
        }
        
        public T targetValue(double targetValue) {
            this.targetValue = targetValue;
            return getThis();
        }

        public ActivityIndicator build() {
        	ActivityIndicator activityIndicator =  new ActivityIndicator(this);
        	if(activityIndicator.getActual() < 0){
        		throw new IllegalStateException("Actual value of Indicator can't be less than 0"); // thread-safe
        	}
        	return activityIndicator;
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

    protected ActivityIndicator(Init<?> init) {
        super(init);
        this.actualValue = init.actualValue;
        this.baselineValue = init.baselineValue;
        this.targetValue = init.targetValue;
    }
    
    private double getActual(){
    	return actualValue;
    }
}
