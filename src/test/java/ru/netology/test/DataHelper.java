package ru.netology.test;


import lombok.Value;

public class DataHelper {
    private DataHelper()  {}

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo(){
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(){
        return new AuthInfo("petya", "123qwerty");
    }


    @Value
    public  static class VerificationCode{
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authinfo){
        return new VerificationCode("12345");
    }

    public static String getCardFirstId(){
        return "92df3f1c-a033-48e6-8390-206f6b1f56c0";
    }

    public static String getCardSecondId(){
        return "0f3f5c2a-249e-4c3d-8287-09f7a039391d";
    }

    public static int getCardBaseBalance(){
        return 10000;
    }

    @Value
    public static class ReplenishmentData{
        private Integer sum;
        private String cardNumber;

    }

    public static ReplenishmentData getTransferDataCard1ToCard2(){
        return new ReplenishmentData(2000, "5559 0000 0000 0002");
    }

    public static ReplenishmentData getTransferDataCard2ToCard1(){
        return new ReplenishmentData(2000, "5559 0000 0000 0001");
    }

}
