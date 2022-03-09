package banlKreditMassiv;

public class Main {
 static int x=4;
    public static void main(String[] args) {


        Client cli1 = new Client("Петр");
        Client cli2 = new Client();
        Client cli3 = new Client("Иван", 100);
        Client cli4 = new Client("Игорь","Потребительский", 25);
      //  Client cli5 = new Client("Павел","Авто", 200);

        Client Spisok[] = new Client[x];

        Spisok[0] = cli1;
        Spisok[1] = cli2;
        Spisok[2] = cli3;
        Spisok[3] = cli4;
      // Spisok[4] = cli5;
        for (int i = 0; i < x; i++) {
            if (Spisok[i].SummOfCredit >= 36) {
                System.out.println(
                        "Имя: " + Spisok[i].name +"/"+ "  Сумма кредита: "+
                                  Spisok[i].SummOfCredit+" руб/"+"  Кредит: "+
                                  Spisok[i].nameOfCredit);


            }
        }
    }
}
