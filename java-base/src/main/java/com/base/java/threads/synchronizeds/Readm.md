1）当一个线程正在访问一个对象的synchronized方法，那么其他线程不能访问该对象的其他synchronized方法。
这个原因很简单，因为一个对象只有一把锁，当一个线程获取了该对象的锁之后，其他线程无法获取该对象的锁，所
以无法访问该对象的其他synchronized方法。

2）当一个线程正在访问一个对象的synchronized方法，那么其他线程能访问该对象的非synchronized方法。这个
原因很简单，访问非synchronized方法不需要获得该对象的锁，假如一个方法没用synchronized关键字修饰，说
明它不会使用到临界资源，那么其他线程是可以访问这个方法的，

3）如果一个线程A需要访问对象object1的synchronized方法fun1，另外一个线程B需要访问对象object2的synchronized
方法fun1，即使object1和object2是同一类型），也不会产生线程安全问题，因为他们访问的是不同的对象，所以不存在互斥问题。



每个类也会有一个锁，它可以用来控制对static数据成员的并发访问。
并且如果一个线程执行一个对象的非static synchronized方法【获取的是对象锁】，另外一个线程需要执行这个对象所属类的static synchronized方法【获取的是类锁】，
此时不会发生互斥现象，因为访问static synchronized方法占用的是类锁，而访问非static synchronized方法占用的是对象锁，所以不存在互斥现象。




Synchronized和Static Synchronized区别

通过分析这两个用法的分析，我们可以理解java中锁的概念。一个是实例锁（锁在某一个实例对象上，如果该类是单例，那么该锁也具有全局锁的概念），
一个是全局锁（该锁针对的是类，无论实例多少个对象，那么线程都共享该锁）。实例锁对应的就是synchronized关键字，而类锁（全局锁）对应的就是static synchronized（或者是锁在该类的class或者classloader对象上）








