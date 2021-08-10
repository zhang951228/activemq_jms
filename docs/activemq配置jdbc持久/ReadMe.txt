落地表：
SELECT T.*,T.ROWID FROM  activemq_lock  T;
SELECT T.*,T.ROWID FROM  activemq_msgs  T;
SELECT T.*,T.ROWID FROM  activemq_acks  T;

注意jar包的导入，参照如下：
commons-dbcp-1.4.jar
commons-pool-1.6.jar
ojdbc7.jar