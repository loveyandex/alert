package com.okta.developer.alert.domain;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.Instant;

/**
 * A Store.
 */
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String name;

    private String address;

    private StoreStatus status;

    private Instant createTimestamp;

    private Instant updateTimestamp;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Store id(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Store name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public Store address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StoreStatus getStatus() {
        return this.status;
    }

    public Store status(StoreStatus status) {
        this.status = status;
        return this;
    }

    public void setStatus(StoreStatus status) {
        this.status = status;
    }

    public Instant getCreateTimestamp() {
        return this.createTimestamp;
    }

    public Store createTimestamp(Instant createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    public void setCreateTimestamp(Instant createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Instant getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public Store updateTimestamp(Instant updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    public void setUpdateTimestamp(Instant updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Store)) {
            return false;
        }
        return id != null && id.equals(((Store) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Store{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", address='" + getAddress() + "'" +
            ", status='" + getStatus() + "'" +
            ", createTimestamp='" + getCreateTimestamp() + "'" +
            ", updateTimestamp='" + getUpdateTimestamp() + "'" +
            "}";
    }
}
