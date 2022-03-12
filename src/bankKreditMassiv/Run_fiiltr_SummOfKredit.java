package bankKreditMassiv;

import org.w3c.dom.ls.LSOutput;

public class Run_fiiltr_SummOfKredit {
 static int x=5;  //  Кол-во клиентов
    static int filtr_SummOfKredit= 36; //величина, относительно которой
                         // происходит фильтрация, если сумма кредита больше этой
                         // величины, то распечатается имя клиента и название кредита
    public static void main(String[] args) {


        Client cli1 = new Client("Петр");
        Client cli2 = new Client();
        Client cli3 = new Client("Иван", 100);
        Client cli4 = new Client("Игорь","Потребительский", 25);
        Client cli5 = new Client("Павел","Авто", 200);

        Client Spisok[] = new Client[x];

        Spisok[0] = cli1;
        Spisok[1] = cli2;
        Spisok[2] = cli3;
        Spisok[3] = cli4;
        Spisok[4] = cli5;
        System.out.println("-------------------");
        for (int i = 0; i < x; i++) {
            if (Spisok[i].SummOfCredit >= filtr_SummOfKredit) {
                System.out.println(
                        "Имя: " + Spisok[i].name +"/"+ "  Сумма кредита: "+
                                  Spisok[i].SummOfCredit+" руб/"+"  Кредит: "+
                                  Spisok[i].nameOfCredit);


            }
        }
    }
}
