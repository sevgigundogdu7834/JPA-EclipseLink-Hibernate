package main.java._01_Notes;

public class JPAArchitecture {


// Metadata /ustveri

// - Annotation
// - XML


// JPA

// javax.persistence.EntityManagerFactory
// javax.persistence.EntityManager
// javax.persistence.EntityTransaction
// javax.persistence.Persistence

// @PersistenceContext
// @PersistenceUnit


// Persistence sinifindan , EntityManagerFactory elde edebiliriz.

// Persistence # public static EntityManagerFactory createEntityManagerFactory(String persistenceUnitName)
// Persistence Unit name alir -> EntityManagerFactory

// 1 Persistence N tane EntityManagerFactory olusturabilir.

// EntityManagerFactory -> EntityManager olusturabiliriz.
// 1 EntityManagerFactory N tane EntityManager olusturabilir.
// 1 EntityManagerFactory 1 PersistenceUnit tarafindan konfigure edilir.

// public EntityManager createEntityManager();

// EntityManager , Entity ler uzerinde yaptigimiz islemlerden sorumludur.

// EntityManager -> EntityTransacation lari elde ederiz.

// EntityManager tarafindan yonetilen/managed edilen tum Entity obje kumesine PersistenceContext adi verilir.

// Persistence Unit
// persistence.xml dosyasinda konfigurasyon bilgilerimiz yer alacak.
// Persistence Unit -> entity classlarinin belirtildigi , veritabani bilgilerinin yer aldigi konfigurasyon bilgisi.

// #### source folder altinda META-INF klasoru altinda yer almalidir!!!

}
