/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro11l4;

/**
 *
 * @author David-pc
 */
public class Bugatti {
    /*
    С крышей или без? Вот в чем вопрос
    Ты сделал предзаказ на новенькую Bugatti ровно полгода назад. Сейчас июнь, 
    и было бы неплохо все-таки ездить на кабриолете. Но ты забыл, в каком кузове заказывал машину.
    Твоя задача — добавить функциональность для получения текущей конфигурации и изменения её при необходимости. Для этого создай геттеры и сеттеры.
    */
    
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
