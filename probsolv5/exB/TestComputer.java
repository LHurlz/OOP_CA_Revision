package probsolv5.exB;

public class TestComputer {
    public static void main(String[] args) {
        Computer c1 = new Computer(new Case("Optiplex 7010","Dell",240,new Dimension(275,250,100)),"Acer 5363","Asus 2345");
        Computer c2 = new Computer(new Case("Optiplex GX620","Dell",230,new Dimension(315,300,120)),"LG 3421","Intel 6533");
        Computer c3 = new Computer(new Case("i-Blason","Apple",115,new Dimension(250,275,110)),"HP 5433","AMD 1942");

        Computer[] allComputers = new Computer[3];
        allComputers[0]=c1;
        allComputers[1]=c2;
        allComputers[2]=c3;

        System.out.println("Displaying the state of the " + allComputers.length + " objects at this point");

        for(int i=0;i< allComputers.length;i++){
            System.out.println("\n\nComputer " + (i+1) + "\n\n"+allComputers[i]);
        }

        System.out.println("\n\nNow displaying a list of any Computer objects whose case model includes the word \"Optiplex\"\n\n");

        String optiplexList="";

        for(int i=0; i< allComputers.length;i++){
            if(allComputers[i].getCaseDetails().getModel().toLowerCase().contains("optiplex"))
                optiplexList+=allComputers[i]+"\n\n";
        }

        System.out.println(optiplexList);
    }
}
