package cssp.model;

public class TokenManager {
    private static int token;
    public static int getToken(){
        return token;
    }
    public static void setToken(int newToken){
        token = newToken;
    }
}
