# GoodDoggo

### Dokumentacja API

##### Lista wszystkich psów
Lista wszystkich psów doatepna przez endpoint `/dogs` zwracający listę wszystkich psów w bazie ograniczoną domyślnie do 30 rekordów.
```
{
   "status":{
      "code":200,
      "message":"Wszystko jest git"
   },
   "response":[
      {
         "image":"http://obrazek2.jpg"
      },
      {
         "image":"http://obrazek1.jpg"
      }
   ]
}
```

##### Konkretny pies
Endpoint `/dogs/{id}` zwracający zdjęcie konkretnego psa.

```
{
   "status":{
      "code":200,
      "message":"Wszystko jest git"
   },
   "response":{
      "image":"http://obrazek2.jpg"
   }
}
```


##### Konkretna rasa psów
Endpoint `/dogs?breed=york` zwracający listę wszystkich psów o podanej rasie.

```
{
   "status":{
      "code":200,
      "message":"Wszystko jest git"
   },
   "response":[
      {
         "image":"http://obrazek2.jpg"
      },
      {
         "image":"http://obrazek1.jpg"
      }
   ]
}
```
