package bankKreditMassiv;

 public class Client {
    String name;
    String nameOfCredit;
    int SummOfCredit;

    { name="Неизвестный";
       SummOfCredit=0;
       nameOfCredit="Типовой";
    }

    Client(String name1) {
       this.name=name1;
    }

    Client(String name1, String nameOfCredit1, int SummOfCredit1 ){
       this.name=name1;
       this.nameOfCredit=nameOfCredit1;
       this.SummOfCredit=SummOfCredit1;;
    }

    Client(String name1,  int SummOfCredit1 ){
       this.name=name1;
       this.SummOfCredit=SummOfCredit1;;
    }

    Client(int i) {
    }

    Client() {
    }

}
