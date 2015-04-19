package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by rosteiner on 4/19/15.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}