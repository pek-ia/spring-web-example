package org.yearup.springwebexample;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHelloController {

    @GetMapping("/welcome")
    public String sayHello(){
        return "Hello world wide web";
    }

    @GetMapping("/welcome/duck")
    public String sayHelloForAFriend(){
        return """
    <html>
    <body>
    <h1>Quack</h1>
    <h2>Quack again</h2>
    <p>don't make me say it again....</p>
    </body>
    </html>
    """;
    }

}
