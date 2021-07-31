package applications;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		Object obj = x;//se ao inves de colocar o Object e colocar o Interger não precisaria colocar o cast no obj
		System.out.println(obj);
		System.out.println(x);
		int y = (int) obj;
		System.out.println(y);
	}

}
