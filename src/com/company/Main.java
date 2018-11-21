package com.company;

//import com.sun.org.apache.xpath.internal.operations.String;
class Print{
	void print(){
		System.out.println("print...");
	}
}

class Cookie{
	private Cookie(){
	}
	private  static Cookie ps1 = new Cookie();
	public static Cookie access(){
		return ps1;
	}
	public void f(){
		Print p = new Print();
		p.print();
		System.out.println("cookie..");
	}
}

public class Main {

	public static void main(String[] args) {

		Cookie.access().f();
		/*(() 1)
		(() new String())
		(() true)
		(() 5.0)
*/

		//Cookie x = new Cookie();
		//x.bite();

/*		com.sun.org.apache.xpath.internal.operations.String string = new com.sun.org.apache.xpath.internal.operations.String();
		String s = "ada";*/
		// write your code here
/*		boolean i = true;
		if(i){
			test(1, 5);
		}*/

		//System.out.println("Hello World!");
	}
}
