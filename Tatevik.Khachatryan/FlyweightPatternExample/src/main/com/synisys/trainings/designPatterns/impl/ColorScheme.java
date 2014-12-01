package main.com.synisys.trainings.designPatterns.impl;

public enum ColorScheme {
	GREEN {
		@Override
		public String getColor() {
			return "green";
		}
	},
	BLUE {
		@Override
		public String getColor() {
			return "blue";
		}
	},
	YELLOW {
		@Override
		public String getColor() {
			return "yellow";
		}
	};

	public abstract String getColor();
}
