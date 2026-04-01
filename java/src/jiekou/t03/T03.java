package jiekou.t03;

public class T03 {
    public static void main(String[] args) {
        PrintMachine[] printMachines={new JGPrint(),new ZSPrint()};
        Master master=new Master();
        for(PrintMachine p:printMachines){
            master.doPrint(p);
        }
    }
}
