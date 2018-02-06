# bhola1

to get mysql to connect with android try using this tutorial.
the only lines of code you should have to replace are

String queryString = "select * from csc4360_class.film limit 5";

and

   private static final String database_url = "jdbc:mysql://frankencluster.com:3306/csc4360_class";
    private static final String database_user = "csc4360dbviewer";
    private static final String database_pass = ";fw3X2K!a]b,";
    // placeholder that you will be updating with the database data
    
    
    change the query to something like shoppingapp.column1 to pull the first five strings of data from that column.
    The second part you just have to modify to match your the credentials for the database. 
    I'm not sure if you can use localhost as a database url when not using the emulator but let me know if it doesn't work.
  
