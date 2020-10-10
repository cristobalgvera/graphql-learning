package cl.crisgvera.graphqllearning.resolver.bank.query;

import cl.crisgvera.graphqllearning.domain.bank.BankAccount;
import cl.crisgvera.graphqllearning.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Log4j2
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
        log.info("Retrieving bank account id: {}", id);

        return BankAccount.builder()
                .id(id)
                .currency(Currency.CLP)
                .build();
    }

}
