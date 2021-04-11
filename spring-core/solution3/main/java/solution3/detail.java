package solution3;

public class detail {
	BankAccountRepositoryImpl bankAccountRepository = null;
	public double withdraw(long accountId, double balance) {
                if(bankAccountRepository.bankacc.get(accountId).getAccountBalance() >= balance)
                {
                    bankAccountRepository.updateBalance(accountId,bankAccountRepository.getBalance(accountId)-balance);
                    return balance;}
				return -1;
	}

    public double deposit(long accountId, double balance) {
                bankAccountRepository.updateBalance(accountId,bankAccountRepository.getBalance(accountId)+balance);
                return balance+bankAccountRepository.getBalance(accountId);}

    public double getBalance(long accountId) {
                return bankAccountRepository.getBalance(accountId);
            }

    public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
                if(bankAccountRepository.getBalance(fromAccount) >= amount)
                {
                    bankAccountRepository.updateBalance(fromAccount,bankAccountRepository.getBalance(fromAccount)-amount);
                    bankAccountRepository.updateBalance(toAccount,bankAccountRepository.getBalance(toAccount)+amount);
                }
				return false;
    }

    public BankAccountRepositoryImpl getBankAccountRepository() {
        return bankAccountRepository;
    }

    public void setInitializeRepositories(BankAccountRepositoryImpl initializeRepositories) {
        bankAccountRepository=initializeRepositories;
        bankAccountRepository.bankacc=initializeRepositories.bankacc;
    }
}
