package io.quarkiverse.sqlite4j.it.jpa;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Used to test reflection references for JPA
 *
 * @author Emmanuel Bernard emmanuel@hibernate.org
 */
@SuppressWarnings("unused")
@Entity
public class Customer extends Human {
    @Id
    // no getter explicitly to test field only reflective access
    private Long id;

    private Address address;
    private WorkAddress workAddress;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Address is referenced but not marked as @Embeddable
    @Embedded
    public Address getAddress() {
        return address;
    }

    public WorkAddress getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(WorkAddress workAddress) {
        this.workAddress = workAddress;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
