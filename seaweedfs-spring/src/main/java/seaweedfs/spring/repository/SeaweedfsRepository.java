package seaweedfs.spring.repository;

import org.springframework.data.repository.CrudRepository;
import seaweedfs.spring.core.SeaweedfsOperations;

import java.io.Serializable;

public interface SeaweedfsRepository <T, ID extends Serializable> extends CrudRepository<T, ID> {

    /**
     * @return a reference to the underlying {@link SeaweedfsOperations operation template}.
     */
    SeaweedfsOperations getSeaweedfsOperations();

}
