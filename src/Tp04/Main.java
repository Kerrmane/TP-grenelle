package Tp04;
import java.util.ArrayList;

public class Main {

    public static  void main(String[] args) {


        TypeBorne type1 = new TypeBorne(60,30,10000, "brn1");
        TypeBorne type2 = new TypeBorne(90,60,15000, "brn2");
        TypeBorne type3 = new TypeBorne(40,20,10000, "brn3");




        Borne Brn1 = new Borne(145,(new DateBorne(2021,11,5)),type1,670);
        Borne Brn2 = new Borne(146,(new DateBorne(2021,9,5)),type1,670);
        Borne Brn3 = new Borne(147,(new DateBorne(2021,9,20)),type2,6000);
        Borne Brn4 = new Borne(148,new DateBorne(2021,5,19),type3,1000);
        Borne Brn5 = new Borne(149,new DateBorne(2021,10,12),type1,80000);




        ArrayList<Borne> lesBornes1 = new ArrayList<Borne>();
        ArrayList<Borne> lesBornes2 = new ArrayList<Borne>();
        ArrayList<Borne> lesBornes3 = new ArrayList<Borne>();

        Station s1 = new Station(13,"ville",lesBornes1);
        Station s2 = new Station(14,"ville2zoo",lesBornes2);
        Station s3 = new Station(15,"ville2vrai",lesBornes3);

        s1.ajouteBorne(Brn1);
        s1.ajouteBorne(Brn3);
        s2.ajouteBorne(Brn2);
        s2.ajouteBorne(Brn5);
        s3.ajouteBorne(Brn4);
        System.out.print(s1.getLesBornes());
       





















    }
}
