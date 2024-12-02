package irina.martinez.jpa.api;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserRestApi {

    private final String url = "https://jsonplaceholder.typicode.com/users";

    public UserRestApi() {}

    public List<String> getUsers() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<String>> response = restTemplate.exchange(
                this.url,
                HttpMethod.GET,
                null,  
                new ParameterizedTypeReference<List<String>>() {}
        );

        return response.getBody();
    }
}
