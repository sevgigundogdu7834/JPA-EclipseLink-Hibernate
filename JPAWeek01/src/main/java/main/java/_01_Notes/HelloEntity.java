package main.java._01_Notes;

public class HelloEntity {

    //Entity veritabanımız ile yazılımımız arasında ilişki kurmamızı sağlayan kalıcı nesneler olarak tanımlanabilir.
    //Öğrencilerimizi tuttuğumuz bir Öğrenci tablomuz var. Bu tabloya eklenen her öğrenci aslında bir Entitydir.
// Entity -> varlik gibi bir turkce karsiligi vardir.
// JPA acisindan Entity -> "kalici nesne/persistent object" ifadesi daha dogru bir yaklasim olacaktir.

// Entity lerin ozellikleri ;

// Persistability
// Entity'lerin kalici persistable hale gelme ozelligi olmalidir.


// Idendtity
// identity -> kimlik
// Entity, veritabanina kaydedildiginde  unique/tekil bir identity/kimlik bilgisine sahip olmalidir.
// primary key bilgisi!

// Transactionality
//
// Transaction -> turkce karsilik olarak islem gibi bir anlama gelir.
//

// ornek bir "transaction" akisi ;
// sinemadan bilet alma senaryosu

// 1 - koltugu sec
// 2 - koltuk adina rezerve olsun
// 3 - odeme yap
// 4 - bileti al

// bu 4 adima transaction adini veriyoruz.
// herhangi adimda problem oldugunda islem roll back yapilir /iptal/revert edilir
// her sey basariliysa commit edilir.

// transaction ->
// 1 - programatic transaction
// 2 - decative transaction

// ACID
// Atomicity
// Consistent
// Isolated
// Durability


// Granularity
// Granularity -> tanecikli olma  ,ortalama oge boyutu turkce karsilik olarak
//
// java.lang.String , entity olamaz. Attribute olabilir
// Wrapper siniflar entity oalamz.

// e-commerce projesi
// business domain object
// Product.java
// Customer.java
// Market.java
// ..

// HR-projesi

// Employee.java
// Departmant.java
// Project.java
// Address.java..

// ....
// Book.java
// Auther.java
// Publisher.java
//

//String , Integer vs siniflar  fine-grained-> ince taneli ozellige sahiptir bunlar entity olamaz.


// JPA spectinte ;
// an entity is a lightweight persistent domain object.

// lightweight -> hafif onemsiz gibi anlamlara gelmektedir.

// JPA , ya da yazilim acisindan ; lightweight kavrami
// az kod olmasi  az sinif olmasindan ziyade ;
// kod degisikligi yapilidiginda minimum impact , minimum duzeyde kod degisiki yapma zorunlulugu gibi anlamlara gelir.

}
