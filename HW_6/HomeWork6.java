import java.util.*;

public class HomeWork6 {
    public static void main(String[] args) {
        Client client1 = new Client("Client1", 36);
        Account account1 = new Account(client1, 2646);
        Account account2 = new Account(client1, 674);
        client1.addAccount(account1);
        client1.addAccount(account2);
        Client client2 = new Client("Client2", 46);
        Bank.getAccounts().put(account1, account1);
        Bank.getAccounts().put(account2, account2);
        Bank.findClient(account2);
        Bank.getClients().put(client1, client1);
        Bank.getClients().put(client2, client2);
        Bank.findAccounts(client1);

    }
}

class Bank {
    private static Map<Client, Client> clients = new HashMap<>();
    private static Map<Account, Account> accounts = new HashMap<>();

    public static Map<Account, Account> getAccounts() {

        return accounts;
    }

    public static Map<Client, Client> getClients() {
        return clients;
    }

    public static void findAccounts(Client client) {
        ArrayList<Account> clientAccounts = Bank.getClients().get(client).getClientAccounts();
        System.out.println(clientAccounts);
    }

    public static void findClient(Account account) {
        Client client = Bank.getAccounts().get(account).getClient();
        System.out.println(client);
    }

}

class Client {
    private String clientName;
    private int clientAge;
    private ArrayList<Account> clientAccounts = new ArrayList<>();

    public Client(String clientName, int clientAge) {
        this.clientName = clientName;
        this.clientAge = clientAge;
    }

    public String getClientName() {
        return clientName;
    }

    public  void addAccount(Account account) {
        this.clientAccounts.add(account);
    }

    public ArrayList<Account> getClientAccounts() {
        return clientAccounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientAge == client.clientAge && Objects.equals(clientName, client.clientName) && Objects.equals(clientAccounts, client.clientAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientAge);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientAge=" + clientAge + "}";
    }

}

class Account {
    private int accountCoins;
    private Client client;

    public Account(Client client, int accountCoins) {
        this.accountCoins = accountCoins;
        this.client = client;
    }


    public Client getClient() {
        return client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountCoins == account.accountCoins && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountCoins, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountCoins=" + accountCoins +
                ", client=" + client +
                '}';
    }

}