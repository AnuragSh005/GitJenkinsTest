package com.anurag.samplecodes;

public class EnumInsideMethod {
	enum Season{
		WINTER(5),FALL(10);
		int value;
		private Season(int value) {
			this.value=value;
		}
	}
	public void enumTestMethod()
	{
		Season s=Season.FALL;
		System.out.println(s.value);
	}

}
