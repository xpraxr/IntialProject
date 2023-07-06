package maths;

public class ArithmeticOP {

	int intV1 = 1;
	int intV2 = 2;
	double doubleV1 = 3;
	double doubleV2 = 10.9;
	float  floatV3 = 2;
	


void add() {
	int result = intV1 + intV2;
	System.out.println("sum: "+ result);
}

void sub() {
	int result = intV1 + intV2;
	System.out.println("difference: "+ result);
}

void div() {
	double result = doubleV2/doubleV1;
}

void mod() {
	double result = doubleV2 % doubleV1;
	System.out.println("reminder: "+ result);
}

}