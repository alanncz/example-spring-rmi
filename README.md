# example-spring-rmi
Before starting to use the transactions you need to tell Spring that you want to perform transaction control by annotations, this is done through configuration in the applicationContext.xml file:

``<tx:annotation-driven transaction-manager="transactionManager"/>``


