# example-spring-rmi
Before starting to use the transactions you need to tell Spring that you want to perform transaction control by annotations, this is done through configuration in the applicationContext.xml file:

``<tx:annotation-driven transaction-manager="transactionManager"/>``

# Let's use another approach

``@EnableTransactionManagement`` is used to replace the tag, where we say to Spring to enable transaction management by annotations.

With the class ``PersistenceConfig`` we defined the settings for connection to the database, for this example was using an in-memory database, the H2.

Use ``JpaVendorApdater`` to connect specific behaviors from the chosen ORM to Spring, in our case, Hibernate.

Define how to create and share an ``EntityManagerFactory`` in the context of Spring, thus allowing the use of dependency injection.

Pass to the Spring this ``EntityManagerFactory`` that will be used by for transaction management.

In the ``ExampleApp`` class we have the context definition of the application, where we only need to include the import so that the persistence settings are loaded. With this set up you will be able to use the ``@Transactional`` annotation to define which particular method or methods should be within a transaction. By defining ``@Transactional`` at the class level, all of its methods executed within transactions.

The ``ObjectServiceImpl`` class is annotated with ``@Transactional``, it is being accessed remotely with RMI usage by clients, from which point all remote calls directed to their methods will be executed in transactions.


