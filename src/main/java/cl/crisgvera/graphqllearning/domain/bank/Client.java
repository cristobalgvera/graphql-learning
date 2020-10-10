package cl.crisgvera.graphqllearning.domain.bank;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Builder
@Value
public class Client {

    UUID id;
    String firstName, lastName;
    List<String> middleNames;
    Client client;

}
