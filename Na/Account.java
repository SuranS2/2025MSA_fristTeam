package Na;

import java.util.ArrayList;
import java.util.List;

class Transaction{
	//임시
	Transaction(String s, long l, long l2){
		
	}
}

public class Account {
	private String accountNo; //계좌번호
	private String name; //소유자명
	private long balance; //잔고
	private List<Transaction> transactions; //거래내역

	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		this.transactions = new ArrayList();
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	//입금
	public void deposit(long amount) {
		this.balance += amount;
		System.out.printf("%d원 입금하셨습니다.\n현재 잔액은 %d원 입니다.\n", amount, this.balance);
		transactions.add(new Transaction("입금", amount, this.balance)); //거래내역 추가
	}

	//출금
	public void withdraw(long amount) {
		if(this.balance<amount) System.out.println("잔액이 부족합니다.");
		else {
			this.balance -= amount;
			System.out.printf("%d원 인출하셨습니다.\n", amount);
			transactions.add(new Transaction("출금", amount, this.balance)); //거래내역 추가
		}
		System.out.printf("현재 잔액은 %d원 입니다.\n", this.balance);
	}

	//잔고 확인
	public long getBalance() {
		System.out.printf("현재 잔액은 %d원 입니다.\n", this.balance);
		return this.balance;
	}

	//거래내역 확인
	public List<Transaction> getTransactions() {
		
		//거래내역 출력
		for(Transaction transaction : transactions) {
			System.out.println(transaction.toString());
		}
		
		return this.transactions;
	}
	
	@Override
    public String toString() {
        return "[ 계좌번호:" + this.accountNo +
                ", 소유자 명:" + this.name + ", 잔액: " +
                this.balance  + " ]";
    }

}
