package Sistem;

import Sistem.ATM;
import Sistem.Card;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String dateInString = "8-May-2024";
        Date date;
        try {
            date = formatter.parse(dateInString);
        } catch (Exception e) {
            date = new Date();
        }
        Card card1 = ATM.createCard(
                "Saddam Hussain",
                date,
                "111111",
                1000000,
                "12345",
                Card.Type.DEBIT
        );
        Card card2 = ATM.createCard(
                "Von Der Bach",
                new Date(),
                "111111",
                1000000,
                "12345",
                Card.Type.DEBIT
        );
        ATM.withdraw(card1.getNumberId(), "12345", 100000);
        ATM.printAllActiveCard();
        ATM.deactivateCard(card1.getNumberId());
        ATM.printAllActiveCard();
        ATM.reactivateCard(card1.getNumberId());
        ATM.printAllActiveCard();
        ATM.printCardDetail(card1.getNumberId());
    }
}