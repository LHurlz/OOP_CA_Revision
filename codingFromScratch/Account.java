package codingFromScratch;

public class Account {
    private char type;
    private String username;
    private String password;

    public Account(char type,String username,String password){
        setType(type);
        setUsername(username);
        setPassword(password);
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account Type: "+getType()+"\nUsername: "+getUsername()+"\nPassword: "+getPassword();
    }
}
