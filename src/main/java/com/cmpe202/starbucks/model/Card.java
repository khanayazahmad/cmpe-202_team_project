

package com.cmpe202.starbucks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Card details implements Singleton
 */
@Entity
@Table(name = "card")
public class Card {
//    private static Card cardInstance;

    @Id
    @Column(length = 9)
    private String cardNumber;

    private String cardCode;

    private double balance;

    private Card() {
        this.cardNumber = "000000000";
        this.cardCode = "000";
        this.balance = 0.00;
    }

    public Card(String cardNumber, String cardCode, double balance) {
        this.cardNumber = cardNumber;
        this.cardCode = cardCode;
        this.balance = balance;
    }

    /**
     * Return class instance
     * 
     * @return Card instance
     */
//    public static Card getInstance() {
//        if (cardInstance == null) {
//            cardInstance = new Card();
//        }
//        return cardInstance;
//    }

    /** Reset Card Details */
    public void resetCard() {
        this.cardNumber = "000000000";
        this.cardCode = "000";
        this.balance = 0.00;
    }

    /**
     * 
     * @param num  card number
     * @param code card code
     * @param amnt card amount
     */
    public void setCard(String num, String code, double amnt) {
        this.cardNumber = num;
        this.cardCode = code;
        this.balance = amnt;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}