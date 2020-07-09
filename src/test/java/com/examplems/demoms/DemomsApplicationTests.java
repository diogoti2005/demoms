package com.examplems.demoms;



import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;




//@SpringBootTest(webEnvironment = RANDOM_PORT)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class YourTestClass {
    @LocalServerPort
    int port;


}
