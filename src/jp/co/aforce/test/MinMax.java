package jp.co.aforce.test;

public class MinMax {

	//練習問題２
	int getMaxValue(int value1,int value2,int value3) {
		int MaxInteger = 0;
		if(value1 > value2 && value1 > value3) {
			MaxInteger = value1;
		}else if(value2 > value1 && value2 > value3) {
			MaxInteger = value2;
		}else if(value3 > value1 && value3 > value2) {
			MaxInteger = value3;
		}
		return MaxInteger;
	}

	int getMinValue(int value1,int value2,int value3) {
		int MinInteger = 0;
		if(value1 < value2 && value1 < value3) {
			MinInteger = value1;
		}else if(value2 < value1 && value2 < value3) {
			MinInteger = value2;
		}else if(value3 < value1 && value3 < value2) {
			MinInteger = value3;
		}
		return MinInteger;
	}

}
