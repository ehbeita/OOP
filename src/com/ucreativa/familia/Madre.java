package com.ucreativa.familia;

public class Madre {

    private int Age;
    private String Hobby;

    public Madre(){
        this.Age=65;
        this.Hobby="Ver 'Caso Cerrado'";
    }

    public int getAge(){
        return this.Age;
    }

    public void setAge(int numero){
        this.Age=this.Age+1;
    }
}
