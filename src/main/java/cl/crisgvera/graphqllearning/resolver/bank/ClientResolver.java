package cl.crisgvera.graphqllearning.resolver.bank;

import cl.crisgvera.graphqllearning.domain.bank.BankAccount;
import cl.crisgvera.graphqllearning.domain.bank.Client;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.UUID;

@Log4j2
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    // In GraphQLResolver<T>, T refers to an entity that will need the return object defined on class methods

    public Client client(BankAccount bankAccount) {
        log.info("Retrieving client data for bank account id: {}", bankAccount.getId());

        return Client.builder()
                .id(UUID.randomUUID())
                .firstName("Cristobal")
                .middleNames(Arrays.asList("Alexander", "TEST"))
                .lastName("Gajardo")
                .build();
    }

}
