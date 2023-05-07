package math.app.version1;
import jakarta.annotation.PostConstruct;
import org.bson.types.ObjectId;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DanePolecenie {
    @Autowired
    private DzialRepozytorium dzialRepozytorium;
    @Autowired
    private PolecenieRepozytorium polecenieRepozytorium;

    @Autowired
    private PodpowiedziRepozytorium podpowiedziRepozytorium;
    ObjectId objectId = new ObjectId("60aebcd18b1d701c78fb9a9f");
    ObjectId objectId_1 = new ObjectId("64220d2f3c0fce4cd8cf2623");
    ObjectId objectId_2 = new ObjectId("64220d473c0fce47b834b9e6");
    ObjectId objectId_3 = new ObjectId("64220d503c0fce2a88d6d495");
    ObjectId objectId_4 = new ObjectId("64220d5b3c0fce4454f0e913");
    ObjectId objectId_5 = new ObjectId("64220d683c0fce56505792ad");
    ObjectId objectId_6 = new ObjectId("64220d713c0fce5b7c986349");
    ObjectId objectId_7 = new ObjectId("64220d7e3c0fce3794f5d1da");
    ObjectId objectId_8 = new ObjectId("64220d8c3c0fce50281a3b0a");
    ObjectId objectId_9 = new ObjectId("64220d993c0fce4bb4a3e832");
    ObjectId objectId_10 = new ObjectId("64220dba3c0fce07e00377a1");
    ObjectId objectId_11 = new ObjectId("64220dc63c0fce22f4815427");
    ObjectId objectId_zad1 = new ObjectId("642dce37ee266907e571344c");
    ObjectId objectId_zad2 = new ObjectId("642dce37ee266907e571344d");
    ObjectId objectId_zad3 = new ObjectId("642dce38ee266907e571344e");
    ObjectId objectId_zad4 = new ObjectId("642dce38ee266907e571344f");
    ObjectId objectId12 = new ObjectId("642ef53f43ed9e48334bad01");
    ObjectId objectId13 = new ObjectId("642ef53f43ed9e48334bad02");
    ObjectId objectId_zad5 = new ObjectId("642dce38ee266907e571344a");
    ObjectId objectId14 = new ObjectId("642ef53f43ed9e48334bad00");
    ObjectId objectId15 = new ObjectId("642ef53f43ed9e48334bad10");
    ObjectId objectId_zad6 = new ObjectId("642dce38ee266907e571344b");
    ObjectId objectId16 = new ObjectId("642ef53f43ed9e48334bad40");
    ObjectId objectId17 = new ObjectId("642ef53f43ed9e48334bad30");
    ObjectId objectId_zad7 = new ObjectId("642dde38ee266907e571344b");
    ObjectId objectId18 = new ObjectId("642af53f43ed9e48334bad40");
    ObjectId objectId19 = new ObjectId("642bf53f43ed9e48334bad30");
    ObjectId objectId20 = new ObjectId("642cf53f43ed9e48334bad40");
    ObjectId objectId21 = new ObjectId("642df53f43ed9e48334bad30");
    ObjectId objectId_zad8 = new ObjectId("642dfe38ee264907e571344f");
    ObjectId objectId22 = new ObjectId("642af53f43ed9b48334bad30");
    ObjectId objectId23 = new ObjectId("642bf53f43ed9a48334bad50");
    ObjectId objectId24 = new ObjectId("643906cbe79bce41c6c46b9f");
    ObjectId objectId25 = new ObjectId("64390701ad79ba54be56edf2");
    ObjectId objectId_zad9 = new ObjectId("643cde8be117e71f0c8175ec");
    ObjectId objectId26 = new ObjectId("643ce7ca07d750ce20526195");
    ObjectId objectId27 = new ObjectId("643ce1e45836b2290555ba3a");
    ObjectId objectId28 = new ObjectId("643ce1ee78c9d37b5e3859d8");
    ObjectId objectId29 = new ObjectId("643ce1f8e39b43c769e6fd40");

    @PostConstruct
    public void init() {
        Polecenie zad1 = new Polecenie();
        zad1.setTresc("Zaokrąglij do tysięcy liczbę 26675");
        zad1.setPoziom("Łatwy");
        zad1.setId(objectId_zad1);
        ObjectId podpowiedzId = new ObjectId("642ef53f43ed9e48334bad06");
        if (podpowiedziRepozytorium.existsById(podpowiedzId)) {
            Podpowiedzi podpowiedz = podpowiedziRepozytorium.findById(podpowiedzId).orElse(null);
            if (podpowiedz != null) {
                podpowiedz.setId(podpowiedzId);
                zad1.setPodpowiedzi(List.of(podpowiedz));
            }
        }
        zad1.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad1.setDataDodania(LocalDateTime.now());
        zad1.setPoprawnaOdpowiedz("C");
        zad1.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId, "26000", "A"),
                new Odpowiedzi(objectId_1, "26600", "B"),
                new Odpowiedzi(objectId_2, "27000", "C"),
                new Odpowiedzi(objectId_3, "30000", "D")
        )));
        Polecenie zad2 = new Polecenie();
        zad2.setTresc("Zaokrąglij do setek liczbę 1325");
        zad2.setPoziom("Łatwy");
        zad2.setId(objectId_zad2);
        ObjectId podpowiedzId1 = new ObjectId("642ef53f43ed9e48334bad07");
        if (podpowiedziRepozytorium.existsById(podpowiedzId1)) {
            Podpowiedzi podpowiedz1 = podpowiedziRepozytorium.findById(podpowiedzId1).orElse(null);
            if (podpowiedz1 != null) {
                podpowiedz1.setId(podpowiedzId1);
                zad2.setPodpowiedzi(List.of(podpowiedz1));
            }
        }
        zad2.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad2.setDataDodania(LocalDateTime.now());
        zad2.setPoprawnaOdpowiedz("A");
        zad2.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId_4, "1300", "A"),
                new Odpowiedzi(objectId_5, "1500", "B"),
                new Odpowiedzi(objectId_6, "1000", "C"),
                new Odpowiedzi(objectId_7, "2000", "D")
        )));
        Polecenie zad3 = new Polecenie();
        zad3.setTresc("Zaokrąglij do setek liczbę 35675");
        zad3.setPoziom("Łatwy");
        zad3.setId(objectId_zad3);
        ObjectId podpowiedzId2 = new ObjectId("642ef53f43ed9e48334bad04");
        if (podpowiedziRepozytorium.existsById(podpowiedzId2)) {
            Podpowiedzi podpowiedz2 = podpowiedziRepozytorium.findById(podpowiedzId2).orElse(null);
            if (podpowiedz2 != null) {
                podpowiedz2.setId(podpowiedzId2);
                zad3.setPodpowiedzi(List.of(podpowiedz2));
            }
        }
        zad3.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad3.setDataDodania(LocalDateTime.now());
        zad3.setPoprawnaOdpowiedz("D");
        zad3.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId_8, "35600", "A"),
                new Odpowiedzi(objectId_9, "40000", "B"),
                new Odpowiedzi(objectId_10, "30000", "C"),
                new Odpowiedzi(objectId_11, "35700", "D")
        )));
        Polecenie zad4 = new Polecenie();
        zad4.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad4.setTresc("Sprawdź podzielność liczby 41532 przez 3");
        zad4.setPoziom("Średni");
        zad4.setId(objectId_zad4);
        ObjectId podpowiedzId3 = new ObjectId("642ef54043ed9e48334bad05");
        if (podpowiedziRepozytorium.existsById(podpowiedzId3)) {
            Podpowiedzi podpowiedz3 = podpowiedziRepozytorium.findById(podpowiedzId3).orElse(null);
            if (podpowiedz3 != null) {
                podpowiedz3.setId(podpowiedzId3);
                zad4.setPodpowiedzi(List.of(podpowiedz3));
            }
        }
        zad4.setDataDodania(LocalDateTime.now());
        zad4.setPoprawnaOdpowiedz("A");
        zad4.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId12, "Tak jest podzielne przez 3", "A"),
                new Odpowiedzi(objectId13, "Nie, nie jest podzielne przez 3", "B")
        )));
        Polecenie zad5 = new Polecenie();
        zad5.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad5.setTresc("Czy liczba 4009 jest podzielna przez 9? ");
        zad5.setPoziom("Średni");
        zad5.setId(objectId_zad5);
        ObjectId podpowiedziId4 = new ObjectId("642ef54043ed9e48334bad02");
        if(podpowiedziRepozytorium.existsById(podpowiedziId4))
        {
            Podpowiedzi podpowiedz4 = podpowiedziRepozytorium.findById(podpowiedziId4).orElse(null);
            if(podpowiedz4 != null)
            {
                podpowiedz4.setId(podpowiedziId4);
                zad5.setPodpowiedzi(List.of(podpowiedz4));
            }
        }
        zad5.setDataDodania(LocalDateTime.now());
        zad5.setPoprawnaOdpowiedz("B");
        zad5.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId14, "Tak jest podzielna przez 9", "A"),
                new Odpowiedzi(objectId15, "Nie, nie jest podzielna przez 9","B")
        )));
        Polecenie zad6 = new Polecenie();
        zad6.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad6.setTresc("Czy liczba 2600 jest podzielna przez 3? ");
        zad6.setPoziom("Średni");
        zad6.setId(objectId_zad6);
        ObjectId podpowiedziId5 = new ObjectId("642ef54043ed9e48334bad20");
        if(podpowiedziRepozytorium.existsById(podpowiedziId5))
        {
            Podpowiedzi podpowiedz6 = podpowiedziRepozytorium.findById(podpowiedziId5).orElse(null);
            if(podpowiedz6 != null)
            {
                podpowiedz6.setId(podpowiedziId5);
                zad6.setPodpowiedzi(List.of(podpowiedz6));
            }
        }
        zad6.setDataDodania(LocalDateTime.now());
        zad6.setPoprawnaOdpowiedz("B");
        zad6.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId16, "Tak jest podzielna przez 3", "A"),
                new Odpowiedzi(objectId17, "Nie, nie jest podzielna przez 3","B")
        )));
        Polecenie zad7 = new Polecenie();
        zad7.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad7.setTresc("Czy liczba 23432 po zaokrągleniu do setek jest podzielna przez 3? Jak wygląda ta liczba po zaokrągleniu? ");
        zad7.setPoziom("Trudny");
        zad7.setId(objectId_zad7);
        ObjectId podpowiedziId6 = new ObjectId("642ef32043ed9e48334bad20");
        if(podpowiedziRepozytorium.existsById(podpowiedziId6))
        {
            Podpowiedzi podpowiedz7 = podpowiedziRepozytorium.findById(podpowiedziId6).orElse(null);
            if(podpowiedz7 != null)
            {
                podpowiedz7.setId(podpowiedziId6);
                zad7.setPodpowiedzi(List.of(podpowiedz7));
            }
        }
        zad7.setDataDodania(LocalDateTime.now());
        zad7.setPoprawnaOdpowiedz("A");
        zad7.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId18, "Tak jest podzielna przez 3 a liczba zaogrąglona to 23400", "A"),
                new Odpowiedzi(objectId19, "Nie, nie jest podzielna przez 3 a liczba zaokrąglona to 23400","B"),
                new Odpowiedzi(objectId20, "Nie, nie jest podzielna przez 3 a liczba zaokrąglona to 23500","C"),
                new Odpowiedzi(objectId21, "Tak jest podzielna przez 3 a liczba zaokrąglona to 23500","D")
        )));

        Polecenie zad8 = new Polecenie();
        zad8.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad8.setTresc("Znajdź dwie liczby całkowite, jedna będzie licznikiem a druga mianownikiem Twojego ułamka, które jako ułamek będą reprezentować liczbę 0,(8) ");
        zad8.setPoziom("Trudny");
        zad8.setId(objectId_zad8);
        ObjectId podpowiedziId7 = new ObjectId("642fe12043ed9e48334bad20");
        if(podpowiedziRepozytorium.existsById(podpowiedziId7))
        {
            Podpowiedzi podpowiedz8 = podpowiedziRepozytorium.findById(podpowiedziId7).orElse(null);
            if(podpowiedz8 != null)
            {
                podpowiedz8.setId(podpowiedziId7);
                zad8.setPodpowiedzi(List.of(podpowiedz8));
            }
        }
        zad8.setDataDodania(LocalDateTime.now());
        zad8.setPoprawnaOdpowiedz("D");
        zad8.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId22, "4/5", "A"),
                new Odpowiedzi(objectId23, "10/13","B"),
                new Odpowiedzi(objectId24, "12/15","C"),
                new Odpowiedzi(objectId25, "8/9","D")
        )));
        Polecenie zad9 = new Polecenie();
        zad9.setDzialName("Cyfry, podzielność i zaokrąglanie liczb");
        zad9.setTresc("Znajdź 3 kolejne liczby całkowite, których suma dwóch pierwszych liczb podzielona przez trzecią liczbę daje wynik 3/2");
        zad9.setPoziom("Trudny");
        zad9.setId(objectId_zad9);
        ObjectId podpowiedziId8 = new ObjectId("643ce0d09c4dab42ec0c3880");
        if(podpowiedziRepozytorium.existsById(podpowiedziId8))
        {
            Podpowiedzi podpowiedz9 = podpowiedziRepozytorium.findById(podpowiedziId8).orElse(null);
            if(podpowiedz9 != null)
            {
                podpowiedz9.setId(podpowiedziId8);
                zad8.setPodpowiedzi(List.of(podpowiedz9));
            }
        }
        zad9.setDataDodania(LocalDateTime.now());
        zad9.setPoprawnaOdpowiedz("C");
        zad9.setOdpowiedziId(new ArrayList<>(List.of(
                new Odpowiedzi(objectId26, "1,2,3", "A"),
                new Odpowiedzi(objectId27, "2,3,4","B"),
                new Odpowiedzi(objectId28, "4,5,6","C"),
                new Odpowiedzi(objectId29, "6,7,8","D")
        )));

        List<Polecenie> PolecenieList = List.of(zad1, zad2, zad3,zad4, zad5,zad6,zad7,zad8,zad9);
        for (Polecenie polecenie : PolecenieList) {
            saveIfNotExists(polecenie);
        }
    }
    public void saveIfNotExists(@NotNull Polecenie polecenie) {
        if (polecenie.getId() == null) {
            polecenieRepozytorium.save(polecenie);
        } else {
            Optional<Polecenie> existingPolecenie = polecenieRepozytorium.findById(polecenie.getId());
            if (existingPolecenie.isEmpty()) {
                polecenieRepozytorium.save(polecenie);
            }
        }
    }
    }
