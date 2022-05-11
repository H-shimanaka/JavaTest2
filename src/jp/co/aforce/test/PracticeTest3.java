package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticeTest3 {

	public static void main(String[] args) {

		//練習問題１
		String[] Tanaka = {"1","田中太郎","男性","27"};


		//練習問題２
		System.out.println(Tanaka[1]);


		//練習問題４
		Employee TanakaData = new Employee();
		Employee SatoData = new Employee();
		Employee SuzukiData = new Employee();

		TanakaData.setDate(1, "田中太郎", "男性", 27);
		SatoData.setDate(2, "佐藤花子", "女性", 22);
		SuzukiData.setDate(3, "鈴木次郎", "男性", 31);

		ArrayList<Employee> Employees = new ArrayList<>();
		Employees.add(TanakaData);
		Employees.add(SatoData);
		Employees.add(SuzukiData);

		for(Employee employee : Employees) {
			System.out.println("番号は" + employee.getNumber() + "、名前は" + employee.getName() + "、年齢は" + employee.getAge() + "です");
		}


		//練習問題５
		HashMap<String, Integer> Subjects = new HashMap<>();
		Subjects.put("国語", 90);
		Subjects.put("数学", 80);
		Subjects.put("英語", 65);

		for(Map.Entry<String, Integer> subject : Subjects.entrySet()) {
			System.out.println(subject.getKey() + ":" + subject.getValue());
		}



		//練習問題６
		//リストや配列では科目名と点数に分けて作る必要があったので、
		//キー・バリュー形式で保存できるMap形式の方が適していると考えたからです。


	}

}
