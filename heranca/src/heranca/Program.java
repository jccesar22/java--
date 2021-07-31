package heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SaveAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SaveAccount(10001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SaveAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("total balance : %.2f\n", sum);
		for(Account acc : list) {
			acc.deposit(10.0);
		}
			
		for(Account acc : list) {
			System.out.printf("update balance for %s account %d : %.2f\n",acc.getHolder(),acc.getNumber(),acc.getBalance());
		}
		
}
}





/*
 * este codigo foi implemntado 
 * 
 * Account acc = new Account(1001, "Alex ", 0.0);
BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//mostrando o metodo upcasting
Account acc1 =  bacc;
Account acc2 = new BusinessAccount(103,  "Bob", 0.0, 200.0);
Account acc3 = new SaveAccount(1004, "Anna", 0.0, 0.01);


// downcasting

BusinessAccount acc4 = (BusinessAccount)acc2;
acc4.loan(100.0);
//cuidado quando você converte o codigo exemplo embaixo não mostra erro porem em tempo de execulsão ele dara erro
//BusinessAccount acc5 = (BusinessAccount)acc3;
// testando se ele e igual com o if aninhado para que possa usar a class
if (acc3 instanceof BusinessAccount) {
	BusinessAccount acc5 = (BusinessAccount)acc3;
	acc5.loan(200.0);
	System.out.println("Emprestimo");
}
if (acc3 instanceof SaveAccount) {
	SaveAccount acc5 = (SaveAccount)acc3;
	acc5.updateBalance();
	System.out.println("Update!");
}
}
///testando a sub class
Account acc1 =  new Account(1001, "alex", 1000.0);
acc1.withdraw(200.0);
System.out.println(acc1);
System.out.println(acc1.getBalance());
//usando o @Override
Account acc2 = new SaveAccount(1002, "Maria", 1000.0, 0.01);
acc2.withdraw(200.0);
System.out.println(acc2.getBalance());
System.out.println(acc2);

Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
acc3.withdraw(200.0);
System.out.println(acc3.getBalance());

Account x = new Account(1020, "Alex", 1000.0);
Account y = new SaveAccount(1023, "maria", 1000.0, 00.1);

x.withdraw(50.0);
y.withdraw(50.0);
System.out.println(y.getBalance()+ "\n"+ x.getBalance());*/
