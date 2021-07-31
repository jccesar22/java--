package enumerador;

import java.util.Date;

import entities.Order;
import entitis.enusms.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1800,new Date(), OrderStatus.pendin_payument);
		
		System.out.println(order.toString());
		OrderStatus os1 = OrderStatus.devivered;
		OrderStatus os2 = OrderStatus.valueOf("devivered");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
