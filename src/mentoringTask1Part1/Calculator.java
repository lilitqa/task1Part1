package mentoringTask1Part1;

public class Calculator {

	private double value1;
	private double value2;
	private char operator;

	public Calculator(){
		value1 = 0;
		value2 = 0;
	}
	
	public void setValue1(double value){
		this.value1 = value;
	}
	public void setValue2(double value){
		this.value2 = value;
	}
	public void setOperator(char operator){
		this.operator = operator;
	}
	

	private double sum() {

		return value1 + value2;
	}
	
	private double minus() {

		return value1 - value2;
	}

	private double mult() {

		return value1 * value2;
	}
	
	private double div() {

		return value1 / value2;
	}


	public void calculate(){
		switch(operator){
		case '+':
			System.out.print("=" + sum());
			break;
		case '-':
			System.out.print("=" + minus());
			break;
		case '*':
			System.out.print("=" + mult());
			break;
		case '/':
			System.out.print("=" + div());
			break;
			default:
				System.out.println("Incorrect operation.");
				break;				
			
		}
	}
}
