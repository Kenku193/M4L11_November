package org.example;

import org.example.model.Account;
import org.example.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.nio.file.Files;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(Account.class)
                .buildSessionFactory();

        // TRANSIENT
        Client client = new Client();

        try (Session session = sessionFactory.openSession()) {

            // TRANSIENT -> MANAGED
//            Client persistClient = new Client();
//            session.beginTransaction();
//            session.persist(persistClient);
//            session.getTransaction().commit();

            // MANAGED
            // RETURNED DYNAMIC PROXY
//            client = session.load(Client.class, 4);
//
//            session.beginTransaction();
//            session.remove(client);
//            session.getTransaction().commit();
//
//            // DETACHED
//            System.out.println(client.getFirstName());
//
//        }
//
//        System.out.println(client.getLastName());
//        // IF NEEDED RETURN TO MANAGED
//        try (Session session = sessionFactory.openSession()){
//            session.beginTransaction();
//            session.save(client);
//            session.getTransaction().commit();
//        }
//
//            Client persistClient = new Client();
//            session.beginTransaction();
//            session.persist(persistClient);// !
//
////            session.evict(persistClient);
////            session.persist(persistClient);// ?? UPDATE
//
//            session.getTransaction().commit(); // INSERT AT THIS PLACE

//            Client mClient = new Client();
//            mClient.setFirstName("Dima");
//            mClient.setLastName("Ivanov");
//            session.beginTransaction();
//            session.persist(mClient);
//            session.flush();
//
//            mClient.setFirstName("someNewName");
//            session.merge(mClient);
//            session.flush();

//            Query<Client> query = session.createQuery("from Client where id = 15", Client.class);
//            Client singleResult = query.getSingleResult();
//
//            singleResult.setFirstName("Borka");
//            session.beginTransaction();
//            session.merge(singleResult);
//            session.flush();

//            session.beginTransaction();
//            session.persist(new Client());
//            session.flush();

//            Client gettedClient = session.get(Client.class, 17);
////            Client loadedClient = session.load(Client.class, 17);
//            Client findedClient = session.find(Client.class, 17);
//
//            System.out.println(gettedClient);
////            System.out.println(loadedClient);
//            System.out.println(findedClient);

            Client gettedClient = session.get(Client.class, 5);
            System.out.println(gettedClient.getFirstName());

            gettedClient.setFirstName("sdjkfskjjd");
            session.beginTransaction();
            session.persist(gettedClient);
            session.flush();

            session.refresh(gettedClient);
            System.out.println(gettedClient.getFirstName());



        }
    }
}