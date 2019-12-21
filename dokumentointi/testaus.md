# Testausdokumentti

Ohjelmaa on testattu JUnit-testeillä ja käytännön kokeilla esimerkiksi regex-validoinnin onnistumisesta.

## Yksikkötestaus sovelluslogiikalle

Laskutoimitukset ovat jakautuneet omiin luokkiinsa, jotka ovat jaettu johdonmukaisella tavalla eri paketteihin. Eri laskutoimitustyyppejä vastaavat JUnit-testiluokat ovat aina testattavan luokan kanssa samassa paketissa. JUnit-testejä on paketeissa: calculator.function1, calculator.matrix ja calculator.vectors. Calculator.function1-paketissa on testiluokka FunctionTest, joka testaa Function-luokan konstruktorin ja metodien toimivuutta.Calculator.matrix-paketissa on testiluokka MatrixTest, joka testaa sekä luokan Matrix että luokan MatrixProduct konstructorien ja metodien toimivuutta. Calculator.vectors-paketissa on testiluokat ScalarProductTest ja VectorTest, jotka testaavat luokkien ScalarProduct ja Vector toimintaa. 

Yleisesti testauksen kohteena ovat olleet pääasiassa konstruktorien toimivuus, haluttujen laskutoimitusten toimivuus sekä laskutulosten näyttämiseen ja tietokantaan tallentamiseen liittyvät toString()- ja toHistory()-metodit.


## Testauskattavuus

Varsinainen tietokannan toiminta jäi(?) yksikkötestauksen ulkopuolelle suoraviivaisuutensa takia. Käyttöliittymäkerros on jätetty ohjeiden mukaisesti kokonaan testauksen ulkopuolelle. Tämä kattaa calculator- ja calculator.ui-paketit, siten että calculator-paketista ei testata CalculatorApplication-luokkaa ja calculator.ui-paketista ei testata mitään.

Function-luokan testaustilanne näyttää tältä:

![Funktio](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kuvat/functionTotal.png)


Matrix-luokan testausraportti näyttää tältä:

![Matrix](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kuvat/matrixtotal.png)

MatrixProduct eli matriisitulo on myös testattu melko kattavasti. ToString-testi jätettiin pois, koska tämän luokan toString-metodin muodostaa oleellisesti Matrix-luokan toString joten tarvittavan tiedon toiminnasta sai jo Matrix-luokan vastaavan metodin testauksella. Saman asian testaaminen kahteen kertaan ei olisi ollut harjoitustyön ohjeistuksessa mainittua järkevää testaamista. Alla MatrixProduct-luokan testiraportti:

![MatrixProduct](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kuvat/matriisitulototal.png)

Vector-luokan testauskattavuus on seuraavanlainen:

![Vector](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/kuvat/vektoritotal.png)








# Järjestelmätestaus






Sovelluksen järjestelmätestaus on ollut suurimmalta osin käsityötä.

## Asennus

Sovellus on haettu ja käynnistetty Linux Cubbli-ympäristössä manuaalissa kuvatuilla tavoilla. Sovelluksen toimivuutta on testattu myös muissa käyttöjärjestelmissä ja näin sovellus on havaittu vakaaksi.

## Toiminnallisuudet

Kaikki toiminnallisuudet on testattu manuaalisesti sekä toimivilla lähtöarvoilla, että virheellisillä syötteillä. Käyttäjän mahdollisuutta virheellisiin syötteisiin on rajoitettu regexillä. Käyttöliittymä tarkastaa syötteet vielä try-catch:illa ja epäonnistuneita syötteitä kommentoidaan vastauskentissä virheilmoituksilla, jotka kertovat jotakin virheestä. Myös näiden virheilmoitusten opastavuutta on pyritty manuaalisesti arvioimaan.
