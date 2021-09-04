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
public class Programmer {
    /*
    Зарплата
    У нас есть класс Programmer, в котором есть очень важное поле — salary. 
    Наша задача следующая: нужно добавить возможность получить и изменить значение этого поля, используя геттер и сеттер.
    Но есть нюанс: зарплату можно только повышать. Поэтому тебе нужно добавить проверку в сеттер: 
    если значение аргумента больше текущего значения, то поле salary изменяем, иначе — игнорируем.
    */
    
    private int salary = 1000;
    
    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int newSalary) {
        this.salary = newSalary < salary ? salary : newSalary;
    }
}
