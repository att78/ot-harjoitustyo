# Manuaali

Ohjelman voi ladata osoitteesta: github.com/att78/ot-harjoitustyo. Sopiva versio löytyy releasien alta.

Käynnistysohjeet koskevat erityisesti Linuxia, sillä harjoitustyö on tehty toimimaan ensisijaisesti Linux-ympäristössä. 
Calculator-1.1 käynnistyy, kun ladatun jar-tiedoston properties "allow executing file as program"-valintaan käy laittamassa ruksin ja sen jälkeen tuplaklikkaa jar-tiedostoa. Calculatorilla on vain graafinen käyttöliittymä, eikä minkäänlaista tekstikäyttöliittymää. Sovelluksen voi käynnistää myös komentorivin kautta Linuxissa komennolla   ./Calculator-1.1.jar
. Jos tästä tulee permission denied virheilmoitus, jar-tiedoston asetuksissa tulee sallia ajaminen ohjelmana edellä kuvatun tavoin.

Windows-ympäristössä ohjelmaa on kokeiltu ja siellä käynnistäminen on ollut niinkin yksinkertaista kuin ohjelman lataus haluttuun kansioon ja tuplaklikkaus käynnistämiseksi.

Ensimmäisenä funktiolaskimessa pääsee päävalikkoon, jossa on vaihtoehtoina yksinkertainen funktio, vektorien pistetulo, matriisitulo ja historia.

![MainValikko](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/Mainvalikko.png)

## Funktio

Painamalla Simple Function pääsee laskeman suoran leikkauspisteet x-akselin ja y-akselin suhteen.  Lukuja antaessa kannattaa huomata, että desimaalierottimena toimii piste eikä pilkku. Simple Functionista pääsee takaisin päävalikkoon painamalla “Main"-nappia


## Skalaaritulo



Painamalla ScalarProduct pääsee laskemaan kahden vektorin pistetulon. Vektorit annetaan muodossa 1,2,3 eli numerot erotellaan pilkuilla. Piste kuvastaa desimaalimerkkiä.

![Skalaaritulo](https://github.com/att78/ot-harjoitustyo/blob/master/dokumentointi/Skalaaritulo.png)


## Matriisitulo
Painamalla MatrixProduct pääsee laskemaan matriisituloa. Matriisitulossa tulee huomioida, että ensimmäinen matriisi annetaan rivivektoreina ja toinen matriisi annetaan sarakevektoreina. Vektoreita antaa joko ensin kaikki ensimmäiseen vektoriin tai vuorotellen molempiin. Syötetyt vektorit näkyvät riveittäin syöttöön käytetyn tekstikentän alapuolella. Kannattaa siis huomata, että toinen kerrottava matriisi annetaan sarakeittain, mutta syötetyt tiedot näkyvät silti riveittäin. Kun vektorit on annettu, Calculate matrixproduct napilla saa tuloksen. 


## Historia

Viimeisimpien laskujen historia menemällä historia näkymään ja yläreunassa olevaa nappia.  
Kaikista näkymistä pääsee takaisin main-valikkoon painamalla "Back to Main"-nappia.

