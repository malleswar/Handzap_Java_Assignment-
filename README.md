# Handzap_Java_Assignment-

1.	Create a REST service which answers following queries from scrap data:
   a.	Search available authors
   b.	Search articles based on author name
   c.	Search articles based on article title and description
   
   
   a.	Search available authors
      http://localhost:8080/handzap/authors
      
        {"status":200,"data":[{"id":101,"name":"malli","email":"malli@gmail.com"}]}
        
   b.	Search articles based on author name
    
        http://localhost:8080/handzap/articles/malli
        
        {"status":200,"data":[{"id":201,"title":"Test_Description","description":"test"},
        {"id":202,"title":"Test_Description1","description":"test1"}]}

   c.	Search articles based on article title and description
    
        http://localhost:8080/handzap/articles/test/Test_Description
        
          {"status":200,"data":[{"id":201,"title":"test","description":"Test_Description","publishedDate":"2018-12-31","author":{"id":101,"name":"malli","email":"malli@gmail.com"}}]}
          
          
