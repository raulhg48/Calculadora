/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

public class Calculadora {

    /**
     * @return the operador1
     */
    public int getOperador1() {
        return operador1;
    }

    /**
     * @param operador1 the operador1 to set
     */
    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    /**
     * @return the operador2
     */
    public int getOperador2() {
        return operador2;
    }

    /**
     * @param operador2 the operador2 to set
     */
    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

    /**
     * @return the operador
     */
    public int getOperador() {
        return operacion;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(int operador) {
        this.operacion = operador;
    }
    private int operador1;
    private int operador2;
    private int operacion;
    
    public static void main(String[] args) {

    }   
}
