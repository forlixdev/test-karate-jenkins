package examples.web;

import com.intuit.karate.junit5.Karate;

class WebRunner {
    
    @Karate.Test
    Karate testUsers() {
        return Karate.run("web").relativeTo(getClass());
    }    

}
