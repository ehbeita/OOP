package com.ucreativa.familia;

public class Marina {

    private int Age;
    private String Hobby;

    public Marina(String saludo){
        this.Age=65;
        this.Hobby="Ver 'Caso Cerrado'";
        System.out.println(saludo);
    }

    public int getAge(){
        return this.Age;
    }

    public void setAge(int numero){
        this.Age=this.Age+1;
    }


}
