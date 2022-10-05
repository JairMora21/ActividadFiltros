/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author JAIR
 */
public class Suma {

    private int num1;
    private int num2;
    private int resultado;

    public Suma(String n1, String n2) {
        this.setNum1(Integer.parseInt(n1));
        this.setNum2(Integer.parseInt(n2));

    }
    
    public void hacerSuma(){
        int s=this.getNum1() + this.getNum2();
        this.setResultado(s);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

}
