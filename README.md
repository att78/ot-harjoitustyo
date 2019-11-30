# HARJOITUSTYÖ

Tämä on **Ohjelmistotekniikan harjoitustyö**. Aiheena on funktiolaskin. 
Tässä vaiheessa ohjelmassa toimii vain yhden lineaarisen suoran ratkaiseminen niin x-akselin kuin y-akselin suhteen. Myöhemmin olisi tarkoitus lisätä lisää toimintoja.


## DOKUMENTAATIO

Työaikakirjanpito:
[Linkki kirjanpito.md:hen](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kirjanpito.md)

Alustava vaatimusmäärittely:
[Linkki maarittely.md:hen](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/maarittely.md)

Alustava kuva arkkitehtuurin rungosta:
[Linkki arkkitehtuuri.md:hen](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/arkkitehtuuri.md)

## KOMENTORIVITOIMINNOT

### Testaus

Testit suoritetaan komennolla mvn test

Testikattavuusraportti luodaan komennolla mvn jacoco:report

Kattavuusraporttia voi tarkastella avaamalla selaimella tiedosto target/site/jacoco/index.html

### Suoritettavan jarin generointi

Komento mvn package

generoi hakemistoon target suoritettavan jar-tiedoston OtmTodoApp-1.0-SNAPSHOT.jar


### Checkstyle

Tiedostoon checkstyle.xml määrittelemät tarkistukset suoritetaan komennolla

 mvn jxr:jxr checkstyle:checkstyle

Mahdolliset virheilmoitukset selviävät avaamalla selaimella tiedosto target/site/checkstyle.html
