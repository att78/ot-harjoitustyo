# HARJOITUSTYÖ

Tämä on **Ohjelmistotekniikan harjoitustyö**. Aiheena on funktiolaskin. 
Tässä vaiheessa ohjelmassa toimii yhden lineaarisen suoran ratkaiseminen niin x-akselin kuin y-akselin suhteen ja kahden vektorin pistetulo. Myöhemmin olisi tarkoitus lisätä lisää toimintoja.

Harjoitustyön release käynnistyy, kun ladatun jar-tiedoston properties  "allow executing file as program"-valintaan käy laittamassa ruksin ja sen jälkeen tuplaklikkaa jar-tiedostoa. Calculatorilla on vain graafinen käyttöliittymä, eikä minkäänlaista tekstikäyttöliittymää.


## DOKUMENTAATIO

Työaikakirjanpito:
[Linkki kirjanpito.md:hen](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kirjanpito.md)

Alustava vaatimusmäärittely:
[Linkki maarittely.md:hen](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/maarittely.md)

Alustava kuva arkkitehtuurin rungosta:
[Linkki arkkitehtuuri.md:hen](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/arkkitehtuuri.md)


## RELEASES
1. Release:
[Linkki 1. versioon](https://github.com/att78/ot-harjoitustyo/releases/tag/viikko5)


## KOMENTORIVITOIMINNOT

### Testaus

Testit suoritetaan komennolla mvn test

Testikattavuusraportti luodaan komennolla mvn test jacoco:report

Kattavuusraporttia voi tarkastella avaamalla selaimella tiedosto target/site/jacoco/index.html

### Suoritettavan jarin generointi

Komento mvn package


### Checkstyle

Tiedostoon checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla

 mvn jxr:jxr checkstyle:checkstyle

Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto target/site/checkstyle.html
