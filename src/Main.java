
  import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso,saldoactual,retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero autmoatico\n"
                + "1. ingresar dinero a la cuenta\n"
                + "2 .retirar dinero de la cuenta \n"
                + "3. salir"));

        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea ingresar en cuenta"));
                     saldoactual = saldo_inicial + ingreso;
                     JOptionPane.showMessageDialog(null,"dinero en cuenta : "+saldoactual);
                     break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad que desea retirar"));

            if (retiro>saldo_inicial){
                JOptionPane.showMessageDialog(null,"no cuenta con el saldo suficiente para este retiro");
            }
            else{
                saldoactual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null,"dinero en cuenta: "+saldoactual);

            }
            break;
            case 3:break;
            default: JOptionPane.showMessageDialog(null,"se equivoco de opcion de menu ");break;




        }
    }

}