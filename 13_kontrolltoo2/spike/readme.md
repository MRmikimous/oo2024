## Matkajad
- Tee uus veebiprojekt. 
- Loo klass (entity) matkaja andmete hoidmiseks (nimi, tema siiamaani elus läbitud kilometraaž, külastatud riikide arv). 
- Primaarvõtmeks pane kas nimetus või automaatselt genereeritud ID – valik on sinu). 
- Tee matkaja jaoks nii Repository kui ka Controller ning loo andmebaasiühendus. 
- Võimalda matkajaid võtta andmebaasist, lisada andmebaasi kui ka kustutada andmebaasist. 
- Tee võimalikult lihtne front-end Reactis, mis võimaldab nii võtta, lisada kui ka kustutada andmebaasist läbi Java back-endi.

## Lisa API otspunkt kilometraaži lisamiseks
- Lisa API otspunkt kilometraaži lisamiseks, mis suurendab selle matkaja kilometraaži arvu. 
- Näita eraldi API otspunkti kaudu kõige suurema kilometraažiga matkajat. 
- Lisa API otspunkt uue külastatava riigi lisamiseks. 
- Näita listina läbi API otspunkti kes on käinud vähemalt front-endist etteantud numbri riikides (front-endis midagi tegema ei pea).
- Tee RestTemplate päring siia API otspunkti: https://restcountries.com/v3.1/all?fields=name
- Tee 3 API otspunkti front-endile: 
    1) kas kõik riigid Listina 
    2) võimalus sisestada riigi esimene täht ning antakse kõik selle tähega algavad riigid (sisestades “M”) 
    3) Listina võti “common” (midagi muud ei ole – ei official võtit, muid võtmeid), ainult Stringide List väljastatakse.
- Tee RestTemplate päring siia API otspunkti: https://freetestapi.com/api/v1/countries
- Näita eraldi API otspunktides kõige väiksema populatsiooniga riiki, kõige suurema pindalaga riiki, kõik riigid väiksema tihedusega kui sisestatud tihedus, kõik riigid sisestatud populatsiooni vahemikus.


## Lisa klass Matkaklubi 
- ning lisa see andmebaasi (omaduseks nimetus, primaarvõtmeks pane kas nimetus või automaatselt genereeritud ID – valik on sinu). 
- Lisa Matkaja klassile Matkaklubi seosena külge. 
- Näita API otspunkti kaudu kui mitu matkajat ühes Matkaklubis on. 
- Teise API otspunkti kaudu tagasta mis on kõigi matkajate kogukilometraaž just selles Matkaklubis. 
- Lisa Matkajale omaduseks “staatus”, sõnana. 
- Sinna on võimalik kirjutada andmebaasi lisades nt “Kuld”, “Plaatinum” jne. 
- Näita API otspunkti kaudu kindlas matkaklubis kõikide “Kuld” staatust omavad matkajate kogukilometraaži.