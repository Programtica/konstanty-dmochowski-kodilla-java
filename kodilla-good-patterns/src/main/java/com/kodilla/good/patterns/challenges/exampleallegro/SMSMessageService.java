package com.kodilla.good.patterns.challenges.exampleallegro;

public class SMSMessageService implements InformationService {
    @Override
    public void inform(User user) {
        String userName = user.getUserName();
        String telephoneNumber = user.getTelephoneNumber();
        System.out.println("Użytkownik o nazwie: " + userName + " i numerze: " + telephoneNumber + ": \n");
        System.out.println("Twoje zamówienie jest w toku!");
    }
}
