# Testausdokumentti

Ohjelmaa on testattu JUnit-testeillä ja käytännön kokeilla esimerkiksi regex-validoinnin onnistumisesta.

## Yksikkötestaus sovelluslogiikalle

Laskutoimitukset ovat jakautuneet omiin luokkiinsa, jotka ovat jaettu johdonmukaisella tavalla eri paketteihin. Eri laskutoimitustyyppejä vastaavat JUnit-testiluokat ovat aina testattavan luokan kanssa samassa paketissa. JUnit-testejä on paketeissa: calculator.function1, calculator.matrix ja calculator.vectors. Calculator.function1-paketissa on testiluokka FunctionTest, joka testaa Function-luokan konstruktorin ja metodien toimivuutta.Calculator.matrix-paketissa on testiluokka MatrixTest, joka testaa sekä luokan Matrix että luokan MatrixProduct konstructorien ja metodien toimivuutta. Calculator.vectors-paketissa on testiluokat ScalarProductTest ja VectorTest, jotka testaavat luokkien ScalarProduct ja Vector toimintaa. 

Yleisesti testauksen kohteena ovat olleet pääasiassa konstruktorien toimivuus, haluttujen laskutoimitusten toimivuus sekä laskutulosten näyttämiseen ja tietokantaan tallentamiseen liittyvät toString()- ja toHistory()-metodit.

Varsinainen tietokannan toiminta jäi yksikkötestauksen ulkopuolelle suoraviivaisuutensa takia. 


