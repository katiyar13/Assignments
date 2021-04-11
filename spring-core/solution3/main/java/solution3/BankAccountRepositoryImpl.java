package solution3;

import java.util.HashMap;
import java.util.Map;

public class BankAccountRepositoryImpl implements BankAccountRepository {
	 Map<Long,BankAccount> bankacc = new HashMap<Long, BankAccount>();
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return bankacc.get(accountId).getAccountBalance();
	}

	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		 bankacc.get(accountId).setAccountBalance(newBalance);
		return newBalance;
	}
	public void setRepository(Map<Long,BankAccount> repository) {
        this.bankacc = repository;
	}
}
