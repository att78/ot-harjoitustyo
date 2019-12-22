# Arkkitehtuurin kuvaus

Tässä on alustava kuvaus CalculationApplication-funktiolaskimesta.

## CalculatorApplication-pakkausrakenne

Pakkausrakenne noudattaa alla olevaa arkkitehtuurikuvausta. CalculatorApplicatioinin main-luokka on pääpakkauksessa yhdessä tietokantaa hallinnoivan History-luokan kanssa. UI-luokka käyttää eri laskutoimitusten luokkia aina tarpeen mukaan.

![Pakkauskaavio](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kuvat/Pakkauskaavio%20vko6.png)


## Käyttöliittymä

Käyttöliittymä sisältää main-näkymän, josta pääsee laskutoimituksiin ja laskutoimistusten historiaan. Jokaiselle laskutoimitukselle on oma näkymä, jossa voi syöttää lähtöarvot ja katsella tulosta. Historia-näkymässä näkee lähtöarvot ja laskutuloksen. Yhteensä näkymiä on 6.

## Sovelluslogiikka

Ensimmäisen asteen suoran leikkauskohtien laskeminen on hyvin suoraviivaista. Oheinen sekvenssikaavio kuvastaa leikkauskohtien laskemiseen liittyvää sovelluslogiikkaa.

![sekvenssikaavio funktiosta](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kuvat/funktio.png)


Oheinen sekvenssikaavio antaa esimerkin sovelluslogiikasta skalaaritulon osalta.

![Sekvenssikaavio skalaaritulosta](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kuvat/Sekvenssikaavio%20skalaaritulosta%20(1).png)

Matriisitulon laskeminen on CalculatorApplicationin monimutkaisin asia niin matemaattisesti kuin sovelluslogiikan osalta.

![Sekvenssikaavio matriisitulosta](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kuvat/matriisitulo.png)


## Tietojen pysyväistallennus

Tiedot luetaan ja haetaan tietokannasta History-luokan avulla.
