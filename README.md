# hibernate-neophyte-a

Базовый набор выживальщика в Hibernate

Карта пакетов, классов и методов:

```
org.hibernate
    SessionFactory
    Session
        .openSession()
        .beginTransaction()
        .persist()
            .remove()
            .flush()
            .close()

org.hibernate.cfg
    Environment

org.hibernate.boot
    Metadata
    MetadataSources
        .getMetadataBuilder()
        .addAnnotatedClass()
	
org.hibernate.boot.registry
    StandardServiceRegistryBuilder
        .applySettings()
        .build()
        .destroy()
    StandardServiceRegistry


jakarta.persistence
    @Entity
    @Table
    @Column
    @Id
    @GeneratedValue

jakarta.persistence.criteria
    CriteriaQuery

jakarta.transaction
    Transaction
    Transactional
```

