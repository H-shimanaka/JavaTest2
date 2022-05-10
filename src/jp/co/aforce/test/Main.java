package jp.co.aforce.test;

public class Main {

	public static void main(String[] args) {

		PracticeTest8 test = new PracticeTest8();

		test.printHello();
		test.printRandomMessage();
		test.printMessage("Hello");
		test.printMessage("Hello", 5);
		test.printRectangleArea(3.14, 9.25);
		System.out.println(test.getWeatherForecast());
		System.out.println(test.isEvenNumber(8));
		System.out.println(test.getMessage("ヒロキ", false));

		String[] array = {"ウマ","パンダ","コアラ"};
		System.out.println(test.getLongestString(array));

		System.out.println(test.isAdult(new Person("シマウマ", 22)));
	}

}
